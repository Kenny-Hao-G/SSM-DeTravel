package com.deTravel.pojo;

/**
 * User 持久层
 *
 * @author KennyHao
 */
public class User {
    private int uId;
    private String uEmail;
    private String uName;
    private String uNickName;
    private String uPassword;
    private String uPhone;
    private String uPicture;

    public User() {
    }

    public User(int uId, String uEmail, String uName, String uNickName, String uPassword, String uPhone, String uPicture) {
        this.uId = uId;
        this.uEmail = uEmail;
        this.uName = uName;
        this.uNickName = uNickName;
        this.uPassword = uPassword;
        this.uPhone = uPhone;
        this.uPicture = uPicture;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNickName() {
        return uNickName;
    }

    public void setuNickName(String uNickName) {
        this.uNickName = uNickName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uEmail='" + uEmail + '\'' +
                ", uName='" + uName + '\'' +
                ", uNickName='" + uNickName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uPicture='" + uPicture + '\'' +
                '}';
    }
}
