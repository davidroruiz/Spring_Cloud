package com.formacionspring.springboot.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudApplication.class, args);
	}

}