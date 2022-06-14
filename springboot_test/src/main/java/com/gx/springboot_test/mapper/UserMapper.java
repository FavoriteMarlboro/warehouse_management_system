package com.gx.springboot_test.mapper;

import com.gx.springboot_test.po.User;
import com.gx.springboot_test.vo.SysUserVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

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
public interface UserMapper extends BaseMapper<User>{
        List<SysUserVo> selectUserList();

        /**
         * 根据id查询用户数据
         * @param id
         * @return
         */
        SysUserVo selectById(Integer id);

        @Delete("DELETE  FROM user WHERE user_id=#{id}")
        Integer deleteUser(Integer id);
}
