package com.kodlakodlat.userservice.service;

import com.kodlakodlat.userservice.model.UserModel;

import java.util.List;

public interface UserService {
    UserModel saveUser(UserModel userModel);
    List<UserModel> getAllUser();
}
