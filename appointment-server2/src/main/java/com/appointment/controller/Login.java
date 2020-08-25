package com.appointment.controller;

import com.appointment.dao.UserMapper;
import com.appointment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("a")
public class Login {

    @Resource
    private UserMapper userMapper;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(HttpServletRequest  request){

        String phone =  request.getParameter("phone");

        System.out.println(phone+"email");

          User user = userMapper.getUserInfo(phone);

        System.out.println("login接口已被条用了");

          return user;

    }

}
