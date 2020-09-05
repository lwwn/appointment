package com.appointment.dao;

import com.appointment.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {

    // 通过登录手机号获取用户信息
     User  getUserInfo(String phone );

    // 通过Id 获取用户信息

     User getAsIdUserInfo(int id);




}
