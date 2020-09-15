package com.appointment.service;

import com.appointment.entity.User;
import com.appointment.utils.BaseResponse;

public interface UserService {

   BaseResponse getUserByLoginPhone(String phone, String password);
}
