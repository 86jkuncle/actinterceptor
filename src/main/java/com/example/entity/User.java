package com.example.entity;

import act.Act;
import act.util.SimpleBean;
import com.example.security.UserLinked;
import org.beetl.sql.core.mapper.BaseMapper;

import javax.persistence.*;

/**
 * @author Administrator
 * @date 2019/10/16 15:06
 */
@Entity
public class User implements SimpleBean, UserLinked {


    private Integer id;


    private String username;


    private String password;


    private String status;

    public void setPassword(String password) {
        this.password = Act.crypto().passwordHash(password);
    }

    public boolean verifyPassword(char[] password) {
        return Act.crypto().verifyPassword(password, this.password);
    }

    @Override
    public String userId() {
        return this.username;
    }
}
