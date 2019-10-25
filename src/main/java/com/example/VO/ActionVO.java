package com.example.VO;

/**
 * @author Administrator
 * @date 2019/10/23 9:49
 */
public class ActionVO {
    private String action;
    private Boolean defaultCheck = false;
    private String describe;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getDefaultCheck() {
        return defaultCheck;
    }

    public void setDefaultCheck(Boolean defaultCheck) {
        this.defaultCheck = defaultCheck;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
