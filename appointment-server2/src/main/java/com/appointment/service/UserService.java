package com.appointment.service;

import com.appointment.entity.User;

public interface UserService {

   User getUserByLoginPhone(String phone, String password);
}
