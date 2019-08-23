package com.hncloud.springcloud.controller;

import com.hncloud.springcloud.entity.Dept;
import com.hncloud.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：liuyilei
 * @description ：部门业务访问层
 * @date ：Created in 2019/5/7 18:08
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> services = client.getServices();
        System.out.println("************" + services);
        List<ServiceInstance> clientInstances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance instance : clientInstances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
            System.out.println(instance.getMetadata());
            System.out.println(instance.getServiceId());
        }
        return this.client;
    }
}
