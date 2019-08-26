package com.tian.jianZaiJi.repository;

import com.tian.jianZaiJi.entity.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * CityRepository
 */
@Repository
public interface CityRepository {

    City getCity(Integer id);

    Integer insertCity(City city);

}
