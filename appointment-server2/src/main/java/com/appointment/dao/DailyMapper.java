package com.appointment.dao;

import com.appointment.entity.Daily;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "dailyMapper")
public interface DailyMapper {

    void createDaily  (Daily daily);

    List<Daily> getDailyList ();
}
