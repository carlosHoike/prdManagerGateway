package com.prdmanager.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PrdManagerGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrdManagerGatewayApplication.class, args);
	}

}
