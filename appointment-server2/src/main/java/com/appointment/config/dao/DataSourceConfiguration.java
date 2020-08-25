package com.appointment.config.dao;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

//数据库配置类
@Configuration
public class DataSourceConfiguration {


    //value读取applicatinon.properties 中属性


    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("jdbc:mysql://localhost:3306/appointment?characterEncoding=utf-8&useSSL=false")
    private  String jdbcUrl;

    @Value("${jdbc.username}")
    private  String jdbcUsername;

    @Value("${jdbc.password}")
    private  String jdbcPassword;

    @Bean(name = "dataSouce")


    public ComboPooledDataSource createDataSouce() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后不自动commit
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }



}
