package com.lshaci.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private DiscoveryClient client;
    
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam String a, @RequestParam String b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        String r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}