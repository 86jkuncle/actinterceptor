package com.example.api;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.beetlsql.BeetlSqlTransactional;
import act.inject.DefaultValue;
import com.example.VO.ActionVO;
import com.example.VO.PermissionVO;
import com.example.VO.RoleVO;
import com.example.VO.UserVO;
import com.example.entity.Account;
import com.example.entity.Permission;
import com.example.entity.Permissions;
import com.example.entity.Role;
import com.example.mapper.AccountMapper;
import org.osgl.$;
import org.osgl.http.H;
import org.osgl.http.Http;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.With;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Administrator
 * @date 2019/10/18 16:27
 */
@UrlContext("/account")
@With(BeetlSqlTransactional.class)
public class AccountController extends Controller.Util {

    @Inject
    private AccountMapper mapper;
    @Inject
    private Permissions.Mapper pmsMapper;
    @Inject
    private H.Request request;

    /**
     * 获取用户信息
     * @param username 用户名
     * @return
     */
    @GetAction("userinfo")
    public UserVO index(@DefaultValue("admin") String username){
        List<Permissions> permissions = pmsMapper.selectPermissions(username);

        Map<String,List<Permissions>> pmap = permissions.parallelStream().collect(
                Collectors.groupingBy(Permissions::getPermissionName,Collectors.toList())
        );
        List<PermissionVO> permissionVOList = convertPermissions(pmap);

        Account account = mapper.selectUser(username);
        Role role = account.role;

        RoleVO roleVO = convertRole(role);
        roleVO.setPermissions(permissionVOList);

        UserVO userVO = convertUser(account);
        userVO.setRoleId(role.name);
        userVO.setRoleVo(roleVO);

        return userVO;
//        Map<String,List<PermissionVO>> permissionVoMap = new HashMap<>(16);
//        permissionVoMap.put("permissions",permissionVOList);
//        System.out.println("contextPaht:"+request.contextPath());
//        System.out.println(request.fullPath());
//        System.out.println("ip:"+request.ip());
//        System.out.println(request.host());
    }

    private RoleVO convertRole(Role role){
        RoleVO roleVO = new RoleVO();
        $.copy(role).mapHead("name").to("id").to(roleVO);
        return roleVO;
    }

    private UserVO convertUser(Account account){
        UserVO userVO = new UserVO();
        $.copy(account).to(userVO);
        return userVO;
    }

    private List<PermissionVO> convertPermissions(Map<String,List<Permissions>> stringListMap){
        List<PermissionVO> permissionVOList = new ArrayList<>();
        for(Map.Entry<String,List<Permissions>> entry:stringListMap.entrySet()){
            List<Permissions> permissionsList = entry.getValue();
            PermissionVO permissionVO = new PermissionVO();
            if(permissionsList.size()>0){
                permissionVO.setRoleId(permissionsList.get(0).getName());
                permissionVO.setPermissionId(permissionsList.get(0).getPermissionName());
                permissionVO.setPermissionName(permissionsList.get(0).getPermissionDesc());
                List<ActionVO> actionVOList = new ArrayList<>();
                for(Permissions permissions1:permissionsList){
                    ActionVO actionVO = new ActionVO();
                    actionVO.setAction(permissions1.getAction());
                    actionVO.setDescribe(permissions1.getDescribe());
                    actionVOList.add(actionVO);
                }
                permissionVO.setActions(actionVOList);
                permissionVO.setActionEntitySet(actionVOList);
//                permissionVO.setActionList(new ArrayList<>());
//                permissionVO.setDataAccess(new ArrayList<>());
                permissionVOList.add(permissionVO);
            }
        }
        return permissionVOList;
    }
}
