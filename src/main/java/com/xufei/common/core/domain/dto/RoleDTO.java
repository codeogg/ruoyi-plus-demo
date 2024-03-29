package com.xufei.common.core.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class RoleDTO implements Serializable {

    private Long roleId;
    private String roleName;
    private String code;
    private Integer dataScope;
    private String dataScopeDeptIds;
}
