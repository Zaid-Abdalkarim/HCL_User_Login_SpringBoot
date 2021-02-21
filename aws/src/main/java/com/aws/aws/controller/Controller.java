package com.aws.aws.controller;

import java.util.Optional;

import com.aws.aws.model.UserModel;
import com.aws.aws.services.UserService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user")
    public String user() {
        return "Hello";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/register")
    public UserModel addUser(@RequestBody UserModel userModel) {
        String rawPass = userModel.getPassword();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(rawPass);
        UserModel safeUser = new UserModel(userModel.getUsername(), encodedPassword);
        return userService.addUser(safeUser);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody UserModel userModel) {
        // if (userService.authenticate(userModel)) {
        // return ResponseEntity.ok(true);
        // } else {
        // }
        return ResponseEntity.ok(false);
    }
}
