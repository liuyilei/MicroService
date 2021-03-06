package com.hncloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：liuyilei
 * @description ：启动类
 * @date ：Created in 2019/5/13 16:23
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class Config_Git_EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}
