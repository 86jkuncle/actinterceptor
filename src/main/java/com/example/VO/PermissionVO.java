package com.example.VO;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/23 9:49
 */
public class PermissionVO {
    private String roleId;
    private String permissionId;
    private String permissionName;
    private List<ActionVO> actions;
    private List<ActionVO> actionEntitySet;
//    private List<String> actionList;
//    private List<String> dataAccess;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<ActionVO> getActions() {
        return actions;
    }

    public void setActions(List<ActionVO> actions) {
        this.actions = actions;
    }

    public List<ActionVO> getActionEntitySet() {
        return actionEntitySet;
    }

    public void setActionEntitySet(List<ActionVO> actionEntitySet) {
        this.actionEntitySet = actionEntitySet;
    }

//    public List<String> getActionList() {
//        return actionList;
//    }
//
//    public void setActionList(List<String> actionList) {
//        this.actionList = actionList;
//    }
//
//    public List<String> getDataAccess() {
//        return dataAccess;
//    }
//
//    public void setDataAccess(List<String> dataAccess) {
//        this.dataAccess = dataAccess;
//    }
}
