package com.appointment.service;

import com.appointment.entity.User;
import com.appointment.utils.BaseResponse;

public interface UserService {

   /**
    *  登录
    * @param phone
    * @param password
    * @return
    */
   BaseResponse getUserByLoginPhone(String phone, String password);

   /**
    *  更新用户信息
    * @param user
    * @return
    */
   BaseResponse updateUser(User user);
}
