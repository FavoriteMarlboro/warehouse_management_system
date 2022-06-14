package com.gx.springboot_test.service.impl;

import com.gx.springboot_test.mapper.UserMapper;
import com.gx.springboot_test.po.User;
import com.gx.springboot_test.service.IUserService;
import com.gx.springboot_test.vo.SysUserVo;
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
public class UserServiceImpl implements IUserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<SysUserVo> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public SysUserVo selectById(Integer id) {
        return this.userMapper.selectById(id);
    }

    @Override
    public int addUser(User user) {
        return this.userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return this.userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return this.userMapper.deleteUser(id);
    }


}
