package com.lshaci.eureka.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lshaci.eureka.consumer.feign.service.ComputeService;

@RestController
public class ConsumerController {
	
    @Autowired
    ComputeService computeService;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
    	System.out.println("访问feign consumer");
        return computeService.add(10, 20);
    }
}