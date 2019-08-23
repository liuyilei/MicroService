package com.hncloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：liuyilei
 * @description ：启动类
 * @date ：Created in 2019/5/8 19:46
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.hncloud.springcloud"})
@ComponentScan("com.hncloud.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
