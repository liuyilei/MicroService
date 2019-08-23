package com.hncloud.springcloud.dao;

import com.hncloud.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：liuyilei
 * @description ：部门数据接口
 * @date ：Created in 2019/5/7 17:52
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
