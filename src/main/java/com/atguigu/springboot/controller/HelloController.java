package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.DataSourceProperties;
import com.atguigu.springboot.bean.DataSourceProperties2;
import com.atguigu.springboot.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RestController // 组合注解 ， 组合 @Controller + @ResponseBody
public class HelloController {

    //@Autowired //Spring框架提供的。 先bytype,再byname
    //@Resource // JDK提供的，比较通用.先byname,再bytype
    //DataSourceProperties dataSourceProperties;

    //@Autowired
    //DataSourceProperties2 dataSourceProperties2;

    //@Autowired
    //JdbcProperties jdbcProperties;

    //@Autowired
    @Resource
    DataSource dataSource;

    @RequestMapping("/hello")
    public String hello(){

        //System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
        //System.out.println("jdbcProperties = " + jdbcProperties);

        System.out.println("dataSource = " + dataSource.getClass().getName());
        
        return "hello,springboot ...";
    }
}
