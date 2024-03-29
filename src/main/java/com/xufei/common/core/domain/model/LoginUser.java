package com.xufei.common.core.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
public class LoginUser implements Serializable {

    private Long id;
    private Long deptId;
    private String username;
    private String nickname;
    private String deptName;
    private String token;

    private Set<String> menuPermission;
    private Set<String> rolePermission;

}
