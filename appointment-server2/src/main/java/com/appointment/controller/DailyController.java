package com.appointment.controller;

import com.appointment.service.impl.DailyServicelmpl;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DailyController {
    @Autowired
    private DailyServicelmpl dailyServicelmpl;

    /**
     * 创建日志
     * @param request
     * @param title
     * @param coverUrl
     * @param content
     * @return
     */
    @RequestMapping(value = "add/daily")
    public BaseResponse createDaily (HttpServletRequest request, String title, String coverUrl, String content){

        return dailyServicelmpl.createDaily(title,coverUrl,content);

    }

    @RequestMapping(value = "get/daily/list")
    public BaseResponse getDailyList( HttpServletRequest request){
        return  dailyServicelmpl.getDailyList(request);
    }



}
