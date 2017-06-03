package com.assignmentserver.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AssignmentserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentserverApplication.class, args);
	}
}
