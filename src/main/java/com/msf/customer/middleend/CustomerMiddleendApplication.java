package com.msf.customer.middleend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CustomerMiddleendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMiddleendApplication.class, args);
	}

}
