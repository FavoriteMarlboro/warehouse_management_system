package com.gx.springboot_test.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    /**
     * 科室/部门_id
     */
    private Integer departmentId;

    /**
     * 科室/部门名称
     */
    private String departmentName;

    /**
     * 备注
     */
    private String departmentRemark;

    /**
     * 上级id
     */
    private Integer parentId;


}