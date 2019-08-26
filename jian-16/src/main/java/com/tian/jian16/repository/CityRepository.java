package com.tian.jian16.repository;

import com.tian.jian16.entity.City;
import org.springframework.stereotype.Repository;

/**
 * CityRepository
 */
@Repository
public interface CityRepository {

    City getCity(Integer id);

    Integer insertCity(City city);

}
