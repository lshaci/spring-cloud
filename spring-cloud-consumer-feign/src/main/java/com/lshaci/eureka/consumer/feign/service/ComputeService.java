package com.lshaci.eureka.consumer.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lshaci.eureka.consumer.feign.service.hystrix.ComputeServiceHystrix;

// 使用@FeignClient("compute-service")注解绑定该接口对应compute-service服务
// 使用@FeignClient注解中的fallback属性指定回调类
@FeignClient(value = "compute-service", fallback = ComputeServiceHystrix.class)
public interface ComputeService {
	
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
