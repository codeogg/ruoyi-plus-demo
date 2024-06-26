package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@TableName("sys_dept")
@EqualsAndHashCode(callSuper = true)
public class SysDept extends BaseEntity {

    @TableId(value = "id")
    private Long id;
    private Long parentId;
    private String ancestors;
    private String deptName;
    private Integer sort;
    private Integer status;
    private Long siteId;

    @TableField(exist = false)
    private List<SysDept> children;
}
