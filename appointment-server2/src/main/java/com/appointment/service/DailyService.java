package com.appointment.service;

import com.appointment.utils.BaseResponse;

import javax.servlet.http.HttpServletRequest;

public interface DailyService {

    // 创建日记
    BaseResponse createDaily(String title, String coverUrl,String content);

    // 获取日记列表
    BaseResponse getDailyList(HttpServletRequest request);

}
