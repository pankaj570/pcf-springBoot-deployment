package com.pcf.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PcfSpringBootDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfSpringBootDeploymentApplication.class, args);
	}

}
