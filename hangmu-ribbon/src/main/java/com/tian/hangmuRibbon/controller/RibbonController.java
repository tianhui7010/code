package com.tian.hangmuRibbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 52613 on 2019/8/24.
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("logUser")
    public void logUserInstance(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("jian-15");
        System.out.println("serviceId is : "+serviceInstance.getServiceId());
        System.out.println("host is : "+serviceInstance.getHost());
        System.out.println("port is : "+serviceInstance.getPort());
    }


}
