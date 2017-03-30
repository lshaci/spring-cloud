package com.lshaci.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 激活Eureka中的DiscoveryClient实现, 才能实现Controller中对服务信息的输出
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
	}
}