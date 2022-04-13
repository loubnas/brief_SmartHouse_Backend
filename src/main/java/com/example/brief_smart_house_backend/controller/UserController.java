package com.example.brief_smart_house_backend.controller;

import com.example.brief_smart_house_backend.entities.User;
import com.example.brief_smart_house_backend.services.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User/")


public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user ){
        User us = userService.AddUser(user);
        return new ResponseEntity<User>(us, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAll( ){
        List<User> users = userService.getAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.CREATED);
    }

}
