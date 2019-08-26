package com.tian.jian16.annotation;

import org.springframework.cloud.netflix.feign.FeignClient;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 52613 on 2019/8/24.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@FeignClient(name = Service.JIAN15)
public @interface Service {

     String JIAN15 = "jian-15";

}
