package com.tian.hangmu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCircuitBreaker
public class HanngMuApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanngMuApplication.class, args);
    }


}
