package com.appointment.service.impl;

import com.appointment.dao.DailyMapper;
import com.appointment.entity.Daily;
import com.appointment.service.DailyService;
import com.appointment.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("DailyServicelmpl")
public class DailyServicelmpl implements DailyService {
    @Autowired
    private DailyMapper dailyMapper;

    @Override
   public BaseResponse createDaily(String title, String coverUrl,String content){
        Daily daily = new Daily( title, coverUrl, content);
        dailyMapper.createDaily(daily);
        return  new BaseResponse("0","成功");
    }

    @Override
    public BaseResponse getDailyList(HttpServletRequest request){

        String userId = request.getParameter("userId");

        System.out.println(userId+"userId值");
      List<Daily>  dailyList =  dailyMapper.getDailyList();
        System.out.println(dailyList+"日记列表");
        return  new BaseResponse(dailyList);

    }
}
