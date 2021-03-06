package com.lshaci.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
	// 通过@Value("${from}")绑定配置服务中配置的from属性
    @Value("${from}")
    private String from;
    
    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
