package com.hncloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuyilei
 * @description ：启动类
 * @date ：Created in 2019/5/7 18:22
 */
@SpringBootApplication
@EnableEurekaClient //将微服务注册到eureka-server
@EnableDiscoveryClient
public class Config_Git_DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_DeptProvider8001_App.class, args);
    }
}
