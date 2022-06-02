package com.example.demo.services;


import com.example.demo.entities.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> find(){
        return userRepository.findAll();
    }
    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
     public void deleteById(Integer id){
        userRepository.deleteById(id);
     }
}
