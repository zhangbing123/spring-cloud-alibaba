package com.zb.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringCloudUserApplication.class, args);
    }

}
