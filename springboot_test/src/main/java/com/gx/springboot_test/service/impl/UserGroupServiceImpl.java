package com.gx.springboot_test.service.impl;

import com.gx.springboot_test.mapper.UserGroupMapper;
import com.gx.springboot_test.po.UserGroup;
import com.gx.springboot_test.service.IUserGroupService;
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
public class UserGroupServiceImpl implements IUserGroupService {

    private UserGroupMapper userGroupMapper;
    @Autowired
    public UserGroupServiceImpl(UserGroupMapper userGroupMapper) {
        this.userGroupMapper = userGroupMapper;
    }

    @Override
    public List<UserGroup> selectAllUserGroup() {
        return this.userGroupMapper.selectAllUserGroup();
    }
}
