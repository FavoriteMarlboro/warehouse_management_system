package com.gx.springboot_test.service;


import com.gx.springboot_test.po.UserGroup;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wb
 * @since 2022-05-30
 */
public interface IUserGroupService{
    /**
     * 查询出全部用户的组信息
     * @return
     */
    List<UserGroup> selectAllUserGroup();
}
