package com.gx.springboot_test.service;

import com.gx.springboot_test.po.User;
import com.gx.springboot_test.vo.SysUserVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wb
 * @since 2022-05-30
 */
public interface IUserService{
    /**
     * 查询全部的用户信息
     * @return
     */
    List<SysUserVo> selectUserList();


    /**
     * 根据id查询用户数据
     * @return
     */
    SysUserVo selectById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);
}
