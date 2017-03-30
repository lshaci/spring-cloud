package com.lshaci.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 开启Zuul
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
	
	/**
	 * 在实现了自定义过滤器之后，还需要实例化该过滤器才能生效
	 * 	可以在过滤器上使用@Component注解
	 */
//	@Bean
//	public AccessFilter accessFilter() {
//		return new AccessFilter();
//	}
}
