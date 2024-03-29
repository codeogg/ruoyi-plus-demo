package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_role")
@EqualsAndHashCode(callSuper = true)
public class SysRole extends BaseEntity {

    private Long id;
    private String roleName;
    private String code;
    private Integer dataScope;
    private String dataScopeDeptIds;
    private Integer status;
    private Long siteId;

}
