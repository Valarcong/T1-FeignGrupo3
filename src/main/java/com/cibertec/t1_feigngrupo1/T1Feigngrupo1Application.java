package com.cibertec.t1_feigngrupo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1Feigngrupo1Application {

	public static void main(String[] args) {
		SpringApplication.run(T1Feigngrupo1Application.class, args);
	}

}
