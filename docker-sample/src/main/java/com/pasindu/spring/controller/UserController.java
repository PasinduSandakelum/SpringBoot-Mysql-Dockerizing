package com.pasindu.spring.controller;

import com.pasindu.spring.model.User;
import com.pasindu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> fetchAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userService.save(user);
    }

}
