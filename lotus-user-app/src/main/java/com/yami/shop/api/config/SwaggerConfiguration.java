

package com.yami.shop.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger文档，只有在测试环境才会使用
 *  @author 春江花朝秋月夜
 */
@Configuration
public class SwaggerConfiguration {

	@Bean
	public GroupedOpenApi createRestApi() {
		return GroupedOpenApi.builder()
				.group("接口文档")
				.packagesToScan("com.yami.shop.api").build();
	}


	@Bean
	public OpenAPI springShopOpenApi() {
		return new OpenAPI()
				.info(new Info().title("lotus-xiang接口文档")
						.description("lotus-xiang接口文档，openapi3.0 接口，用于前端对接")
						.version("v0.0.1")
						.license(new License().name("使用请遵守AGPL3.0授权协议").url("https://www.lotus-xiang.com")));
	}
}
