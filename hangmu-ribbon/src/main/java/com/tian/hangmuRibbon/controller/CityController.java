package com.tian.hangmuRibbon.controller;

import com.tian.hangmuRibbon.response.Response;
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

    /**
     * springCloud第一种调用方式
     */
    @RequestMapping("getCity")
    public Response getCity(Integer id) {
        System.out.println("hangmu getCity");
        City forObject = restTemplate.getForObject("http://jian-15/getCity?id="+id, City.class);
        return Response.success(forObject);
    }
    /**
     * springCloud第二种调用方式
     */
    @RequestMapping("getPerson")
    public Response getCityService(Integer id) {
        System.out.println("hangmu getPerson");
        City person = cityService.getPerson(id);
        return Response.success(person);
    }

    @RequestMapping("getJian15MyMetadata")
    public Response getJian15MyMetadata(Integer id) {
        System.out.println("hangmu getJian15MyMetadata");
        List<ServiceInstance> instances = discoveryClient.getInstances("jian-15");
        return Response.success(instances);
    }

}
