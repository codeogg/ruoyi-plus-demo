package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_user_menu")
@EqualsAndHashCode(callSuper = true)
public class SysUserMenu extends BaseEntity {

    private Long id;
    private Long userId;
    private Long menuId;
    private Integer type;
    private Long siteId;
}
