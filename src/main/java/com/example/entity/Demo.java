package com.example.entity;

import act.util.SimpleBean;
import org.beetl.sql.core.mapper.BaseMapper;
import org.jsoup.Connection;

import javax.persistence.*;

/**
 * @author Administrator
 * @date 2019/10/15 14:21
 */
@Entity
public class Demo implements SimpleBean {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer id;
    @Column
    public String name;
    @Column
    public String gender;

    @Column
    public String email;

    public interface Mapper extends BaseMapper<Demo>{

    }
}
