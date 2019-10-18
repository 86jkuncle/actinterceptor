package com.example.entity;

import act.util.SimpleBean;
import org.beetl.sql.core.mapper.BaseMapper;

import javax.persistence.*;

/**
 * @author Administrator
 * @date 2019/10/16 15:06
 */
@Entity
public class User implements SimpleBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column
    public String username;

    @Column
    public String password;

    @Column
    public String status;

    public interface Mapper extends BaseMapper<User>{

    }
}
