package com.gx.springboot_test.service.impl;

import com.gx.springboot_test.service.IUserService;
import com.gx.springboot_test.vo.SysUserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void selectAll()
    {
        List<SysUserVo> userVoList=userService.selectUserList();
        for (SysUserVo sysUserVo : userVoList) {
            System.out.println(sysUserVo);
        }

    }
}