package com.example.demo.service;

import com.example.demo.api.UserService;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> users =new ArrayList<>();
        Iterable<UserEntity> userEntities = userRepository.findAll();
        for(UserEntity u :userEntities){
            users.add(u);
        }
        return users;
    }


    @Override
    public UserEntity findByUsernameAndPassword(String username,String password) {
        return userRepository.findByUsernameIsAndPasswordIs(username,password);
    }

    @Override
    public boolean CheckUserIsExist(String username) {
        return false;
    }
}
