package com.hncloud.springcloud.service.impl;

import com.hncloud.springcloud.dao.DeptDao;
import com.hncloud.springcloud.entity.Dept;
import com.hncloud.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：liuyilei
 * @description ：部门业务接口实现
 * @date ：Created in 2019/5/7 18:04
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
