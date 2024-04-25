

package com.yami.shop.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * 商城配置文件
 *  @author 春江花朝秋月夜
 */
@Data
@Component
@PropertySource("classpath:admin.properties")
@ConfigurationProperties(prefix = "admin")
public class AdminConfig {

	/**
	 * 数据中心ID
	 */
	private Integer datacenterId;

	/**
	 * 终端ID
	 */
	private Integer workerId;

}
