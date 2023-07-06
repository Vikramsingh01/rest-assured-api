package com.selenium.tutor.restassured.controller;

import com.selenium.tutor.restassured.model.UserInfo;
import com.selenium.tutor.restassured.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@SecurityRequirement(name = "basicAuth")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Page<UserInfo> getAllUsers(Pageable pageable) {
        return userService.getAllUsers(pageable);
    }

    @GetMapping("/{id}")
    public UserInfo getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody UserInfo userInfo) {
        userService.updateUser(id, userInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

    @PostMapping
    public UserInfo saveUser(@RequestBody UserInfo user) {
        return userService.saveUser(user);
    }
}
