package com.example.entity;

import act.Act;
import act.util.SimpleBean;
import com.example.security.UserLinked;
import org.beetl.sql.core.mapper.BaseMapper;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/18 14:29
 */
@Entity
public class Account implements SimpleBean{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public String username;

    public String password;

    public String avatar;

    public Integer status;

    public String telephone;

    public String lastLoginIp;

    public Date lastLoginTime;

    public Integer creatorId;

    public Date createTime;

    public String merchantCode;

    public Integer deleted;

    public Role role;

}
