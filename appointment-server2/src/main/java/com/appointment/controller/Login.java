package com.appointment.controller;

import com.appointment.entity.User;
import com.appointment.service.impl.UserServiceImpl;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("a")
public class Login {

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponse login(HttpServletRequest  request){

        String phone =  request.getParameter("phone");
        String password =  request.getParameter("password");
        System.out.println(phone+"phone"+ password+":password");
        User user =   userService.getUserByLoginPhone(phone,password);

//        System.out.println(phone+"email");

//          User user = userMapper.getUserInfo(phone);

//        System.out.println("login接口已被条用了");

          return new BaseResponse(user);

    }

}
