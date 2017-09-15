package com.banling.sc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.banling.sc.gateway.filter.UserFilter;

@SpringBootApplication
@EnableZuulProxy
public class ScGatewayApplication {
	
	@Bean
	public UserFilter userFilter(){
		return new UserFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ScGatewayApplication.class, args);
	}
}
