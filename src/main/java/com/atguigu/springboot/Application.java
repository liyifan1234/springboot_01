package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//扫描包，默认扫描主程序所在的包以及子包。
//@ComponentScan("com.atguigu.springboot")
@SpringBootApplication //声明当前项目为SpringBoot项目
/**
 * @SpringBootConfiguration（SpringBoot提供的） 等价于@Configuration（Spring提供的） 用于声明配置类。
 * @EnableAutoConfiguration 启用自动配置。
 *      会自动加载 配置类（这些配置类都是框架与第三方集成的配置，框架都提供好了）
 *      从哪加载这些配置类：META-INF/spring.factories 在jar包里搜索
 *      找key=org.springframework.boot.autoconfigure.EnableAutoConfiguration名称的值
 *      Spring 2.2.2 框架提供了124个自动配置类.
 *      例如: XxxxConfiguration 配置类，相当于XML配置文件作用
 *          HttpEncodingAutoConfiguration
 *          每一个配置类，往往都对应一个Xxxproperties属性类；
 *          HttpProperties 用来封装框架默认配置，如果希望修改框架默认配置，就通过特定属性名称进行配置即可。
 *              @ConfigurationProperties(prefix = "spring.http")
            124个配置类会都生效吗？
                根据条件注解进行判断：
                    框架提供了很多以@ConditionalOnXxx注解。

 * @ComponentScan SpringBoot框架默认扫描包，扫描主程序所在的包以及子包
 */

//@ComponentScan("com.atguigu.spirngboot") 约定大于配置
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
