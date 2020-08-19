package com.appointment.controller;

import com.appointment.dao.UserDao;
import com.appointment.entity.User;
import com.sun.deploy.net.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("a")
public class Login {

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(HttpServletRequest  request){

        String phone =  request.getParameter("phone");

          User user = userDao.getUserInfo(phone);

          return user;

    }

}
