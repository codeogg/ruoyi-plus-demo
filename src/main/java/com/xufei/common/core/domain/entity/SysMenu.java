package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@TableName("sys_menu")
@EqualsAndHashCode(callSuper = true)
public class SysMenu extends BaseEntity {

    private Long id;
    private Long parentId;
    private Integer type;
    private String menuName;
    private String permission;
    private Integer sort;
    private String todoSql;
    private String path;
    private String icon;
    private String component;
    private String componentName;
    private Integer status;
    private Integer visible;
    private Integer keepAlive;

    private List<SysMenu> children;

}
