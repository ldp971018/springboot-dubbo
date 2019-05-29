package com.ldp.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//将服务提供者注册到注册中心
//1、引入dubbo和zkclient的相关依赖
//2、配置dubbo的包扫描和注册中心地址
//3、使用service发布服务
@SpringBootApplication
public class TicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketApplication.class, args);
    }

}
