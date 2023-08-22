package com.kodlakodlat.userservice.userServiceImpl;

import com.kodlakodlat.userservice.model.UserModel;
import com.kodlakodlat.userservice.repository.UserRepository;
import com.kodlakodlat.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserModel saveUser(UserModel userModel) {
        userModel.setUserId(String.valueOf(UUID.randomUUID()));
        userRepository.save(userModel);
        return userModel;
    }

    @Override
    public List<UserModel> getAllUser() {
        return userRepository.findAll();
    }
}
