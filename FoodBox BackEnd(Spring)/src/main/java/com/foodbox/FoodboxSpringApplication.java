package com.foodbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FoodboxSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodboxSpringApplication.class, args);
	}

}
