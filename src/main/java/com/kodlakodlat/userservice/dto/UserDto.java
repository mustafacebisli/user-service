package com.kodlakodlat.userservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    long id;
    String userName;
    String email;
    String password;
    String fullName;
    String profilePicture;
    String bio;
    String location;
    String skills;
    String experience;
    String education;
    Date registrationDate;
    Date lastLogin;
    boolean isVerified;
}
