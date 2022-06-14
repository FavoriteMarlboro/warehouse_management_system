package com.gx.springboot_test.service.impl;

import com.gx.springboot_test.mapper.DepartmentMapper;
import com.gx.springboot_test.po.Department;
import com.gx.springboot_test.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wb
 * @since 2022-05-30
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {

    private DepartmentMapper departmentMapper;
    @Autowired
    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public List<Department> selectAllDepartment() {
        return this.departmentMapper.selectAllDepartment();
    }
}
