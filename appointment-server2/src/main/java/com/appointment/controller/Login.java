package com.appointment.controller;

import com.appointment.entity.User;
import com.appointment.service.impl.UserServiceImpl;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Login {

    @Autowired
    private UserServiceImpl userService;

    /**
     *   登录
     * @param request
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping(value = "a/login",method = RequestMethod.POST)
    public BaseResponse login(HttpServletRequest  request, String phone, String password){

//        String phone =  request.getParameter("phone");
//        String password =  request.getParameter("password");
        System.out.println(phone+"phone"+ password+":password");
         if(phone.length() <= 0){
             System.out.println("---------kong----------");
             return new BaseResponse("-1","用户名为空");
         }
         if(password.length() <= 0){

             return new BaseResponse("-1","密码不能为空");
         }else {

             return   userService.getUserByLoginPhone(phone,password);
         }

//        System.out.println(phone+"email");

//          User user = userMapper.getUserInfo(phone);

//        System.out.println("login接口已被条用了");


    }

    /**
     *  更新用户信息
     * @param user
     * @return
     */

    @RequestMapping(value = "a/update/user", method = RequestMethod.PUT)
    public  BaseResponse setUser( User user){

        return  userService.updateUser(user);

    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "a/userInfo", method = RequestMethod.GET)
    public  BaseResponse getUserInfo(int id) {
        return userService.getUserInfo( id);
    }

    @RequestMapping(value = "a/register/user",method = RequestMethod.POST)
    public  BaseResponse registerUser(HttpServletRequest  request, String phone, String password) {
        System.out.println(phone+password+"controller");
        return  userService.registerUser(phone,password );
    }

}
