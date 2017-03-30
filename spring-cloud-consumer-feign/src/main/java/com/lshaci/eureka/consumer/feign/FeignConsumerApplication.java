package com.lshaci.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
// 开启发现服务能力
@EnableDiscoveryClient
// 开启Feign功能
@EnableFeignClients
public class FeignConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}