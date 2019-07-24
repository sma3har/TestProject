package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @Column(length = 50)
    private Integer id;
    @Column(length = 50)
    private String username;
    @Column(length = 50)
    private String password;
}
