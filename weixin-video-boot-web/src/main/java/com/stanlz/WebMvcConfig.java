package com.stanlz;

import com.stanlz.controller.interceptor.MiniInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

	// 注入ZKCuratorClient
	@Bean(initMethod="init")
	public ZKCuratorClient zkCuratorClient() {
		return new ZKCuratorClient();
	}

	// 注入MiniInterceptor
	@Bean
	public MiniInterceptor miniInterceptor() {
		return new MiniInterceptor();
	}

	//	把MiniInterceptor注册到拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 配置需要拦截的接口
		registry.addInterceptor(miniInterceptor())
				.addPathPatterns("/user/**")
				.addPathPatterns("/video/upload",
				"/video/uploadCover",
				"/video/userLike",
				"/video/userUnLike",
				"/video/saveComment")
				.addPathPatterns("/bgm/**")
				.excludePathPatterns("/user/queryPublisher");
		super.addInterceptors(registry);
	}
}
