package com.example.lpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.lpservice")
public class LpServiceApplication {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        SpringApplication.run(LpServiceApplication.class, args);
    }

}
