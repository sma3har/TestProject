package com.example.demo.controller;

import com.example.demo.api.UserService;
import com.example.demo.config.AuthorConfig;
import com.example.demo.entity.UserEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import java.util.List;

@Api(description = "用户接口")
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${author.name}")
//    private String name;
//
//    @Value("${author.sex}")
//    private String sex;

    @Autowired private AuthorConfig authorConfig;
    @Autowired private UserService userService;

    @GetMapping("/hi/")
    public  String sayHello(){

        return "hi you!!!"+authorConfig.getName()
                +":"+authorConfig.getSex()
                +":"+authorConfig.getAge();
    }

    @ApiOperation(value = "查询所有用户" ,  notes="查询所有用户")
    @GetMapping("/users/")
    public List<UserEntity> getAllUsers(){

        return userService.getAllUser();
    }
}
