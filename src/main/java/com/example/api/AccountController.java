package com.example.api;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.beetlsql.BeetlSqlTransactional;
import act.inject.DefaultValue;
import com.example.entity.Account;
import com.example.entity.Permission;
import com.example.entity.Role;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.With;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @date 2019/10/18 16:27
 */
@UrlContext("/account")
@With(BeetlSqlTransactional.class)
public class AccountController extends Controller.Util {

    @Inject
    private Account.Mapper mapper;
    @Inject
    private Role.Mapper roleMapper;

    @GetAction("index")
    public Map<String,List<Account>> index(@DefaultValue("admin") String username){
        Map<String,List<Account>> map = new HashMap<>(16);
        List<Account> accounts = mapper.selectUser(username);
        Account account = accounts.get(0);
        List<Role> roles = account.role;
        Role role = roles.get(0);
        List<Role> roless = roleMapper.selectRole(role.id);
        List<Permission> permissions= roless.get(0).permission;
        map.put("accounts",accounts);
        //map.put("permissions",permissions);
        return map;
    }
}
