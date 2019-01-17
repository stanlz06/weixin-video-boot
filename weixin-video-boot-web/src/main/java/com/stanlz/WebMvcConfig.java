package com.stanlz;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: 静态资源拦截器
 * springboot2.0 WebMvcConfigurerAdapter已过时
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	// 配置静态资源拦截
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
		.addResourceLocations("classpath:/META-INF/resources/") //swagger2
				.addResourceLocations("file:E:/savepath/userinfo-path/"); //本地资源
	}
}
