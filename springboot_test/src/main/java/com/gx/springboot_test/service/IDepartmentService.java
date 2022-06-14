package com.gx.springboot_test.service;


import com.gx.springboot_test.po.Department;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wb
 * @since 2022-05-30
 */
public interface IDepartmentService{
    /**
     * 查询出全部的部门信息
     * @return
     */
    List<Department> selectAllDepartment();
}
