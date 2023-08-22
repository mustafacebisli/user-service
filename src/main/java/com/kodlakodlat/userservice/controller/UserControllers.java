package com.kodlakodlat.userservice.controller;

import com.kodlakodlat.userservice.model.UserModel;
import com.kodlakodlat.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
@RequiredArgsConstructor
public class UserControllers {

   private final UserService userService;

    @PostMapping(value = "/save")
    public UserModel saveUser(@RequestBody UserModel userModel){
        userService.saveUser(userModel);
        return userModel;
    }

    @GetMapping("/getallusers")
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }
}
