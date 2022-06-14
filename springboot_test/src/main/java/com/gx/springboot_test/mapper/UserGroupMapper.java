package com.gx.springboot_test.mapper;

import com.gx.springboot_test.po.UserGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wb
 * @since 2022-05-30
 */
@Repository
public interface UserGroupMapper{
    List<UserGroup> selectAllUserGroup();
}
