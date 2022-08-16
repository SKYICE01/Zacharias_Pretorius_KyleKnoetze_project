package com.example.KyleKnoetze_PRG381_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.KyleKnoetze_PRG381_Project.model.User;
import com.example.KyleKnoetze_PRG381_Project.repository.UserRepository;

@RestController
public class UserController{
   
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User>getallUsers(){
        return userRepository.findAll();
    }
}
