package com.banling.sc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaClient
@PropertySource("classpath:others.properties")
public class VdServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VdServiceDemoApplication.class, args);
	}
}
