package com.example.api;

import act.db.beetlsql.BeetlSqlTransactional;
import com.example.entity.Account;
import com.example.entity.User;
import org.beetl.sql.core.query.Query;
import org.osgl.logging.LogManager;
import org.osgl.logging.Logger;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.mvc.annotation.With;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2019/10/16 15:05
 */
@With(BeetlSqlTransactional.class)
public class LoginController {

    public static final Logger LOGGER = LogManager.get(LoginController.class);
    @Inject
    private User.Mapper mapper;

    @Inject
    private Account.Mapper actMapper;

    @PostAction("/login")
    public Map<String,Object> login(String username,String password){
        LOGGER.debug("用户名{},密码{}",username,password);
        Map<String,Object> map = new HashMap<>(16);
        map.put("code",200);
        map.put("status","OK");
        return map;
    }

    @GetAction("/demo")
    public void demo(){
        Query<Account> query= actMapper.createQuery();
    }

}
