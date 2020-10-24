package com.atguigu.springboot.config;

import com.atguigu.springboot.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootConfiguration //声明一个配置类
public class JdbcConfig {

    @Bean //声明一个Bean对象
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    @ConditionalOnMissingBean
    public DataSourceProperties3 dataSourceProperties3(){
        return new DataSourceProperties3();
    }

}
