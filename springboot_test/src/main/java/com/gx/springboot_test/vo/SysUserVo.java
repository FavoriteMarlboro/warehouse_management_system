package com.gx.springboot_test.vo;


import com.gx.springboot_test.po.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SysUserVo extends User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 性别（0-男性、1-女性）
     */
    private Byte userSex;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 地址
     */
    private String userAddress;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 头像图片
     */
    private String userImage;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户组id
     */
    private Integer userGroupId;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private  String departmentName;

    /**
     * 用户组名称
     */
    private String userGroupName;
}
