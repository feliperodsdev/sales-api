package com.sales.salesapi.controllers;

import com.sales.salesapi.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        User user = new User(1L, "Felipe", "libertyisrequired@gmail.com", "9158");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

}
