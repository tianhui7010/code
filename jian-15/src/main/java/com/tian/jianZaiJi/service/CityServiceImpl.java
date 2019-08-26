package com.tian.jianZaiJi.service;

import com.tian.jianZaiJi.entity.City;
import com.tian.jianZaiJi.repository.CityRepository;
import com.tian.jianZaiJi.utils.annotation.Facade;
import com.tian.jianZaiJi.utils.exception.MyException;
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
        System.out.println("jian-15 getPerson id is : " + id);
        return cityRepository.getCity(id);
    }


    @Override
    public City getCity(Integer id) {
        System.out.println("jian-15 getCity id is : " + id);
        return cityRepository.getCity(id);
    }

    @Override
    public City testException() throws MyException {


         throw new MyException("测试异常！");

    }
}
