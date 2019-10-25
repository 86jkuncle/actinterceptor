package com.example.entity;

import act.util.SimpleBean;
import org.beetl.sql.core.mapper.BaseMapper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/18 15:56
 */
@Entity
public class Role implements SimpleBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public String nickname;

    public String describe;

    public Integer status;

    public Integer creatorId;

    public Date createTime;

    public Integer deleted;

    public List<Permission> permission;

    public interface Mapper extends BaseMapper<Role>{
        List<Role> selectRole(Integer roleId);
        List<Permission> selectPermissions(Integer roleId);
    }
}
