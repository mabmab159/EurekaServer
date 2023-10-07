package com.microservices.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviciosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosApplication.class, args);
    }

}
