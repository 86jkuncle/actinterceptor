package com.example.security;

import act.aaa.ActAAAService;
import com.example.entity.User;

/**
 * @author Administrator
 * @date 2019/10/25 17:24
 */
public class DemoSecurity extends ActAAAService.Base<User> {
    @Override
    protected boolean verifyPassword(User user, char[] password) {
        return user.verifyPassword(password);
    }
}
