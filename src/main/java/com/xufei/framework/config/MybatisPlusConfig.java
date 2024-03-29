package com.xufei.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xufei.**.mapper")
public class MybatisPlusConfig {
}
