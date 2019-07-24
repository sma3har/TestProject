package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author")
@Data
public class AuthorConfig {
    private  String  name;
    private  String  sex;
    private  String  age;
}
