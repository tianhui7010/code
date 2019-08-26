package com.tian.jianZaiJi.service;

import com.tian.jianZaiJi.entity.City;
import org.springframework.stereotype.Service;
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

    @RequestMapping("testException")
    City testException() throws com.tian.jianZaiJi.utils.exception.MyException;
}
