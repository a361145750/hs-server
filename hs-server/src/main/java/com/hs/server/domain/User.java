package com.hs.server.domain;

/**
 * description:${todo} <br/>
 * Date:     2017/7/9 23:49<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class User extends BaseEntity {
    private Long userId;
    private String userName;
    private String loginId;
    private String passWord;
    private Long role;
    private Long userRight;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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
