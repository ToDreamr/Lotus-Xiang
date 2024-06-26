package com.yami.shop.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 *  @author 春江花朝秋月夜
 */
@SpringBootApplication
@ComponentScan("com.yami.shop")
public class WebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebApplication.class);
	}

}
