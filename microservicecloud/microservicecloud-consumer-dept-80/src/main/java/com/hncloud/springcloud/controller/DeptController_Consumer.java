package com.hncloud.springcloud.controller;

import com.hncloud.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：liuyilei
 * @description ：部门业务访问（消费端）
 * @date ：Created in 2019/5/8 19:25
 */
@RestController
public class DeptController_Consumer {

    //普通的rest调用
    //private static final String HTTP_URL_PREFIX = "http://localhost:8001";

    //真正的微服务调用
    private static final String HTTP_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(HTTP_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") String id) {
        return restTemplate.getForObject(HTTP_URL_PREFIX + "/dept/get/" + id , Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(HTTP_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(HTTP_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
