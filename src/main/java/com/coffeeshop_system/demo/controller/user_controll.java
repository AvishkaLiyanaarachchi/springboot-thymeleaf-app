package com.coffeeshop_system.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coffeeshop_system.demo.model.user;
import com.coffeeshop_system.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
public class user_controll {
     @Autowired
     UserService userservice;
     
     @GetMapping
     public Iterable<user> getAllUsers(){
    	 return userservice.getAllUsers();
     }
     @GetMapping("{id}")
     public user userById(@PathVariable("id")int id) {
    	 return userservice.userByID(id);
     }
}
