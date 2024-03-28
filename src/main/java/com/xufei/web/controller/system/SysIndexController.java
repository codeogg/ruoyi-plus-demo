package com.xufei.web.controller.system;

import cn.hutool.core.util.StrUtil;
import com.xufei.common.config.RuoYiConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SysIndexController {

    private final RuoYiConfig ruoYiConfig;

    @GetMapping("/")
    public String index() {
        return StrUtil.format("欢迎使用{}后台管理框架，当前版本：{}，请通过前端访问。",
                ruoYiConfig.getName(), ruoYiConfig.getVersion());
    }
}
