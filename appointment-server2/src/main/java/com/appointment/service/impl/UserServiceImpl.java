package com.appointment.service.impl;

import com.appointment.dao.UserMapper;
import com.appointment.entity.User;
import com.appointment.service.UserService;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseResponse getUserByLoginPhone(String phone, String password) {


        User user = userMapper.getUserInfo(phone);
        if(null == user){
            return  new BaseResponse("-1","账号或者密码错误");
        }
        else if(user.phone.equals(phone)  && user.password.equals(password)){

            return  new BaseResponse(user);
        }else {

            return  new BaseResponse("-2","账号或者密码错误");
        }
//        System.out.println(user.gitHupAccount+"phone-----");

//        return user;
    }
}
