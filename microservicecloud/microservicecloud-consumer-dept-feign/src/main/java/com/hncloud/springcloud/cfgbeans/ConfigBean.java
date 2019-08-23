package com.hncloud.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：liuyilei
 * @description ：配置类
 * @date ：Created in 2019/5/8 19:19
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //再次强调：Spring Cloud Ribbon是基于Netflix Ribbon实现的一套 客户端 负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /* 因为使用自定义规则类MySelfRule，所以暂时注释这个
    @Bean
    public IRule iRule() {
        //return new RoundRobinRule();//轮询算法
        //return new RandomRule();//随机算法
        return new RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }*/
}
