package com.appointment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
}
