package com.tian.jian16.service;

import com.tian.jian16.entity.City;
import com.tian.jian16.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 52613 on 2019/8/24.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City getCity(Integer id) {
        return cityRepository.getCity(id);
    }
}
