package com.xufei.web.controller.system;

import cn.dev33.satoken.annotation.SaIgnore;
import com.xufei.common.core.domain.CommonResult;
import com.xufei.common.core.domain.model.LoginBody;
import com.xufei.system.service.SysLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Validated
@RestController
@RequiredArgsConstructor
public class SysLoginController {

    private final SysLoginService loginService;

    @SaIgnore
    @PostMapping("/login")
    public CommonResult<Map<String, Object>> login(@RequestBody LoginBody loginBody) {
        Map<String, Object> ajax = new HashMap<>();
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        ajax.put("token", token);
        return CommonResult.ok(ajax);
    }
}
