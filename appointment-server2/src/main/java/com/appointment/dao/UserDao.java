package com.appointment.dao;

import com.appointment.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    // 通过登录手机号获取用户信息
     User  getUserInfo(Integer phone );

    // 通过Id 获取用户信息

     User getAsIdUserInfo(int id);



}
