package com.appointment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    public  int id;

//    public  long createAt;

//    public  long  updateAt;

    public  String  name;

    public  int    age = 0;

    public  int   sex = 0;

    public  String   qq;

    public  String email;

    public   String  describe;

    public   String  headImg;

    public   String  gitHupAccount;

    public  String  wxNumber;

    public  String phone;

    public  String  verifyCode;

    public  String password;

    public User(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }
}
