package com.xufei.common.core.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserOnlineDTO implements Serializable {

    private String tokenId;
    private String deptName;
    private String username;
    private String nickname;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private Long loginTime;
}
