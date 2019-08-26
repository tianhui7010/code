package com.tian.jianZaiJi.controller;

import com.tian.jianZaiJi.annotation.Service;
import com.tian.jianZaiJi.entity.City;
import com.tian.jianZaiJi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CityController
 */
@RestController
public class JianCityController {

    @Autowired
    private CityRepository cityRepository;


    @RequestMapping("insertCity")
    public String testMybatis(String cityName, String introuduce) {

        City city = new City(cityName, introuduce);

        Integer count = cityRepository.insertCity(city);
        String result = null;
        if (count != 0) {
            result = "插入" + city.getCityName() + "的信息成功";
        } else {
            result = "插入" + city.getCityName() + "的信息失败";
        }
        return result;

    }

    @RequestMapping("testMybatis")
    public City testMybatis(Integer id) {

        return cityRepository.getCity(id);
    }

}
