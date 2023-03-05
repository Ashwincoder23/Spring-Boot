package com.ecommerce.controller;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
            return userService.saveUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
            return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }




}
