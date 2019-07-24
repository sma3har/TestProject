package com.example.demo.api;

import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserService {

      List<UserEntity> getAllUser();

      UserEntity findByUsernameAndPassword(String username,String password);

      boolean CheckUserIsExist(String username);
}
