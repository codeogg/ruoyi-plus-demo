package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_site")
@EqualsAndHashCode(callSuper = true)
public class SysSite extends BaseEntity {

    private Long id;
    private String name;
    private Integer status;
    private String database;
    private String website;

}
