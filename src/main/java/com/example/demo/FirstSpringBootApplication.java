package com.example.demo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("new comment");
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

}
