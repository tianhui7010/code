package com.tian.jianZaiJi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Jian15Application {

	public static void main(String[] args) {
		SpringApplication.run(Jian15Application.class, args);
	}

}
