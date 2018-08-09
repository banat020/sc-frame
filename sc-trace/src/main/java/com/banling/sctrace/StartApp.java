package com.banling.sctrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer //启动ZipkinServer段
public class StartApp {
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
	
//	@Bean
//    public MySQLStorage mySQLStorage(DataSource datasource) {
//        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
//    }
}
