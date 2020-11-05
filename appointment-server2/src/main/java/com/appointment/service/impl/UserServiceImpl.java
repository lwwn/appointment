package com.appointment.service.impl;

import com.appointment.dao.UserMapper;
import com.appointment.entity.User;
import com.appointment.service.UserService;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public BaseResponse updateUser(User user) {
        System.out.println(user+"用户对象");
        userMapper.updateUser(user);
        return  new BaseResponse("0","更新成功");
    }

    @Override
    public BaseResponse getUserInfo(int id ) {

        if(id == 0) {

            return  new BaseResponse("-1","id为空");

        }else {

            User user = userMapper.getAsIdUserInfo(id);
            if(null == user){

                return  new BaseResponse("-1","未找到用户信息");
            }
            else {

                return  new BaseResponse(user);
            }

        }
    }
    @Override
    public  BaseResponse  registerUser(String phone, String password) {
        if(null == phone || phone.length() == 0 ) {

            return  new BaseResponse("-1","手机号不能为空");

        }else  if(null == password || password.length() == 0) {

            return  new BaseResponse("-1","密码不能为空");

        }else {
            User user = new User(phone,password);
            System.out.println(user+"------------user---");
            userMapper.registerUser(user);
            return  new BaseResponse("0","注册成功");

        }
    }
}
