package com.atguigu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration //声明一个配置类，相当于XML配置
public class DataSourceConfig {

     // <bean id="dataSource" class="xx.yy.DruidDataSource" ></bean>

//    @Bean
//    public DataSource dataSource(){
//        new DruidDataSource();
//    }
}
