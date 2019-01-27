package com.stanlz.cofig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  资源地址的配置对象
 */

@Configuration
@ConfigurationProperties(prefix="com.stanlz")
@PropertySource("classpath:resource.properties")
@Data
public class ResourceConfig {
	/* zookeeper服务器地址 */
	private String zookeeperServer;
	/* 后台管理服务地址 */
	private String bgmServer;
	/* 文件保存的路径 */
	private String fileSpace;
}
