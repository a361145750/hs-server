package com.hs.server.domain;

public class User extends BaseAuditEntity {
    private Long userId;

    private String loginId;

    private String userName;

    private String passWord;

    private Long role;

    private Long userRight;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public Long getUserRight() {
        return userRight;
    }

    public void setUserRight(Long userRight) {
        this.userRight = userRight;
    }

}