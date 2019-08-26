package com.tian.jian16.service;

import com.tian.jian16.annotation.Service;
import com.tian.jian16.entity.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 52613 on 2019/8/23.
 */
@Service
public interface CityService {

    @RequestMapping("getPerson")
    City getPerson(@RequestParam("id") Integer id);

    @RequestMapping("getCity")
    City getCity(Integer id);
}
