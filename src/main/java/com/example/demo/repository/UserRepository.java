package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserEntity,String> {

    UserEntity findByUsernameIsAndPasswordIs(@Param("username") String username,
                       @Param("password") String password);
}
