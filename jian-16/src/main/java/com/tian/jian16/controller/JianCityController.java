//package com.tian.jian16.controller;
//
//import com.tian.jian16.entity.City;
//import com.tian.jian16.repository.CityRepository;
//import com.tian.jian16.service.TestService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * CityController
// */
//@RestController
//public class JianCityController {
//
//    @Autowired
//    private CityRepository cityRepository;
//
//    @Autowired
//    private TestService testService;
//
//    @RequestMapping("insertCity")
//    public String testMybatis(String cityName, String introuduce) {
//
//        City city = new City(cityName, introuduce);
//
//        Integer count = cityRepository.insertCity(city);
//        String result = null;
//        if (count != 0) {
//            result = "插入" + city.getCityName() + "的信息成功";
//        } else {
//            result = "插入" + city.getCityName() + "的信息失败";
//        }
//        return result;
//
//    }
//
//    @RequestMapping("testMybatis")
//    public City testMybatis(Integer id) {
//
//        return cityRepository.getCity(id);
//    }
//
//    @RequestMapping("getCity233")
//    public City getCity(Integer id) {
//        System.out.println("哈哈哈getCity233");
//        City city = testService.getCity(id);
//        return city;
//    }
//}
