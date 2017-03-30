package com.lshaci.eureka.consumer.feign.service.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.lshaci.eureka.consumer.feign.service.ComputeService;

// 创建回调类ComputeClientHystrix, 实现@FeignClient的接口, 此时实现的方法就是对应@FeignClient接口中映射的fallback函数
@Component
public class ComputeServiceHystrix implements ComputeService {

	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return -9999;
	}

}
