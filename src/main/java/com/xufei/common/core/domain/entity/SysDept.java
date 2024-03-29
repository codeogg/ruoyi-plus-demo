package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;

@Data
@TableName("sys_dept")
public class SysDept extends BaseEntity {

    private Long id;
    private Long parentId;
    private String ancestors;
    private String deptName;
    private Integer sort;
    private Integer status;
    private Long siteId;
}
