

package com.yami.shop.admin.config;

import cn.hutool.core.lang.Snowflake;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @author 春江花朝秋月夜
 */
@Configuration
@AllArgsConstructor
public class AdminBeanConfig {

    private final AdminConfig adminConfig;

    @Bean
    public Snowflake snowflake() {
    	return new Snowflake(adminConfig.getWorkerId(), adminConfig.getDatacenterId());
    }
}
