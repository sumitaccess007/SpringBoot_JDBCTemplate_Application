package com.sumitaccess007.controller;
// Make this class as RestController

import com.sumitaccess007.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    // Autowiring the user repository
    @Autowired
    UserRepository userRepository;

    // To test our service is up and running
    @GetMapping
    public String check(){
        return "Welcome to SpringBoot Application Example => SpringBoot + JDBC Template";
    }
    /*
    This method returns the list of usernames
    @return usernameList
     */
    @GetMapping(path = "/getusernames")
    public List<String> getAllUserNames(){
        return userRepository.getAllUserNames();
    }
}
