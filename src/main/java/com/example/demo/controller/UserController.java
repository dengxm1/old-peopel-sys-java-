package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hh")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public User login(@RequestBody User user){
        User u=userService.getUser(user.getName());
        if(u.getPassword().equals(user.getPassword())){
            return  u;
        }
        return null;
    }
}
