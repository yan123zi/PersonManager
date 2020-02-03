package com.pxxy.personManagement.domain;
/**
 * 	管理员的实体类
 * @author 子江
 *
 */
public class Admin {
	/**
	 * 	管理员的id
	 */
    private Integer aId;
    /**
     * 	管理员的用户名
     */
    private String aUsername;
    /**
     * 	管理员的密码
     */
    private String aPassword;
    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

}