package com.example.entity;

import act.util.SimpleBean;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/22 9:58
 */
public class Permissions extends TailBean  {
    private Integer id;
    private String name;
    private String permissionName;
    private String permissionDesc;
    private String action;
    private String describe;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
