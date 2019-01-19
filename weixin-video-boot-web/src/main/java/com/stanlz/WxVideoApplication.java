package com.stanlz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.stanlz.dao")
@ComponentScan(basePackages= {"com.stanlz", "org.n3r.idworker"})
public class WxVideoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WxVideoApplication.class, args);
	}
	
}
