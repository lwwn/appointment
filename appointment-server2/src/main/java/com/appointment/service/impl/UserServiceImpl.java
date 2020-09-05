package com.appointment.service.impl;

import com.appointment.dao.UserMapper;
import com.appointment.entity.User;
import com.appointment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLoginPhone(String phone, String password) {


        if(phone == null || phone.length() <= 0){


        }
        User user = userMapper.getUserInfo(phone);
        System.out.println(user.gitHupAccount+"phone-----");

        return user;
    }
}
