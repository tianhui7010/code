package com.tian.hangmu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tian.hangmu.utils.lisher.ControllerEventPubLisher;
import com.tian.hangmu.utils.response.Response;
import com.tian.jianZaiJi.entity.City;
import com.tian.jianZaiJi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * CityController
 */
@RestController
public class CityController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CityService cityService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ControllerEventPubLisher publisher;
    /**
     * springCloud第一种调用方式
     */
    @RequestMapping("getCity")
    public Response getCity(Integer id) {
        System.out.println("hangmu getCity");
        City forObject = restTemplate.getForObject("http://jian-15/getCity?id="+id, City.class);
        publisher.pushListener("监听器执行：getCity");
        return Response.success(forObject);
    }

    /**
     * springCloud第二种调用方式
     */
    @RequestMapping("getPerson")
    @HystrixCommand(fallbackMethod = "fallback")
    public Response getCityService(Integer id) {
        System.out.println("hangmu getPerson");
        City person = cityService.getPerson(id);
        publisher.pushListener("监听器执行：getPerson");

        return Response.success(person);
    }


    /**
     * springCloud hystrix 容错处理
     */
    public Response fallback(Integer id,Throwable throwable){

        return Response.error("执行方法失败！由hystrix处理异常方法！异常信息为："+throwable);

    }

    @RequestMapping("getJian15MyMetadata")
    public Response getJian15MyMetadata(Integer id) {
        System.out.println("hangmu getJian15MyMetadata");
        List<ServiceInstance> instances = discoveryClient.getInstances("jian-15");
        return Response.success(instances);
    }




}
