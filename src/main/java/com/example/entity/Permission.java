package com.example.entity;

import act.util.SimpleBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 * @date 2019/10/18 16:00
 */
@Entity
public class Permission implements SimpleBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public Integer pid;

    public String permissionId;

    public String permissionName;
}
