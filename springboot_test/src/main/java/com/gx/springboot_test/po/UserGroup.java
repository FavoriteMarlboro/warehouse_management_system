package com.gx.springboot_test.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserGroup implements Serializable {
    /**
     * 用户组ID
     */
    private Integer userGroupId;

    /**
     * 用户组名称
     */
    private String userGroupName;

    /**
     * 说明
     */
    private String remark;


}