package com.xufei.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xufei.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@TableName("sys_user")
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity {

    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String jobNumber;
    private Long deptId;
    private String email;
    private String emailPassword;
    private Integer sex;
    private String avatar;
    private String loginIp;
    private Date lastLoginTime;
    private Integer status;

    @TableField(exist = false)
    private SysDept dept;

}
