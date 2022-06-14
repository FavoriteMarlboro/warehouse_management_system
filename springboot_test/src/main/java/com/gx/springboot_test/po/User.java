package com.gx.springboot_test.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 用户ID
     */
    @Id
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


}