package com.xufei.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "ruoyi")
public class RuoYiConfig {

    private String name;
    private String version;
//    缓存懒加载
    private boolean cacheLazy;
}
