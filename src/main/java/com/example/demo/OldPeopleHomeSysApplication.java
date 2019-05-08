package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication    //声明这是SpringBoot启动类
@EnableTransactionManagement ////开启事务管理
//public class OldPeopleHomeSysApplication extends SpringBootServletInitializer {
    public class OldPeopleHomeSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(OldPeopleHomeSysApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return builder.sources(OldPeopleHomeSysApplication.class);
//    }

}

