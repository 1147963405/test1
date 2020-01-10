package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//注册服务
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class Eureka02Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka02Application.class, args);
	}
//2.创建restTemplate实例对象，用来远程调用服务
	/*@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}*/
}
