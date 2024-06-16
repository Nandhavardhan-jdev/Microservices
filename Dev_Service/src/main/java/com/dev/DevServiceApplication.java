package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DevServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevServiceApplication.class, args);
	}

}
