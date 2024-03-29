package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@TableName("sys_login_info")
@EqualsAndHashCode(callSuper = true)
public class SysLoginInfo extends BaseEntity {

    @TableId(value = "id")
    private Long id;
    private String username;
    private String nickname;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private Integer status;
    private Date loginTime;
}
