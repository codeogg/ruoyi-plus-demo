package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_role_menu")
@EqualsAndHashCode(callSuper = true)
public class SysRoleMenu extends BaseEntity {

    private Long id;
    private Long roleId;
    private Long menuId;
    private Long siteId;
}
