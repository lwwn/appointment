package com.appointment.entity;

public class User {

    public  long id;

    public  long createAt;

    public  long  updateAt;

    public  String  userName;

    public  int    age;

    public  int   sex;

    public  int   qq;

    public  String email;

    public   String  describe;

    public   String  headImg;

    public   String  gitHupAccount;

    public  String  wxNumber;

    public  Integer phone;

    public  int  verifyCode;

    public  Integer passWord;

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public int getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(int verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }


    public User() {
    }

    public User(long id, long createAt, long updateAt, String userName, int age, int sex, int qq, String email, String describe, String headImg, String gitHupAccount, String wxNumber) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.qq = qq;
        this.email = email;
        this.describe = describe;
        this.headImg = headImg;
        this.gitHupAccount = gitHupAccount;
        this.wxNumber = wxNumber;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getGitHupAccount() {
        return gitHupAccount;
    }

    public void setGitHupAccount(String gitHupAccount) {
        this.gitHupAccount = gitHupAccount;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }
}
