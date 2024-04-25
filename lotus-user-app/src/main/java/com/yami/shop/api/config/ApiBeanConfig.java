

package com.yami.shop.api.config;

import cn.hutool.core.lang.Snowflake;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @author 春江花朝秋月夜
 */
@Configuration
@AllArgsConstructor
public class ApiBeanConfig {

    private final ApiConfig apiConfig;

    @Bean
    public Snowflake snowflake() {
        return new Snowflake(apiConfig.getWorkerId(), apiConfig.getDatacenterId());
    }

}
