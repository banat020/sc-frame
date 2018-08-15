package com.banling.sctrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer //启动ZipkinServer
public class StartApp {
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
	
//	@Bean
//    public MySQLStorage mySQLStorage(DataSource datasource) {
//        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
//    }
}
