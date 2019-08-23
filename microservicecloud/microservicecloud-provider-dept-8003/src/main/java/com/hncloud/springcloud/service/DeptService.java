package com.hncloud.springcloud.service;

import com.hncloud.springcloud.entity.Dept;

import java.util.List;

/**
 * @author ：liuyilei
 * @description ：部门业务接口
 * @date ：Created in 2019/5/7 18:03
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
