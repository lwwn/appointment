package com.appointment.controller;

import com.appointment.dao.UserDao;
import com.appointment.entity.User;
import com.sun.deploy.net.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Login {

    @RequestMapping(value = "/a/login",method = RequestMethod.POST)

    public void login(HttpServletRequest  request){

//        Integer phone = request.getParameter("");

//          User user = UserDao.getUserInfo()

    }

}
