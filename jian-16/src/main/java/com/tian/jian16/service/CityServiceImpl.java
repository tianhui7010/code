package com.tian.jian16.service;

import com.tian.jian16.annotation.Facade;
import com.tian.jian16.entity.City;
import com.tian.jian16.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 52613 on 2019/8/23.
 */
@Facade
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public City getPerson(Integer id) {
        System.out.println("jian-16 getPerson id is : " + id);
        return cityRepository.getCity(id);
    }


    @Override
    public City getCity(Integer id) {
        System.out.println("jian-16 getCity id is : " + id);
        return cityRepository.getCity(id);
    }

}
