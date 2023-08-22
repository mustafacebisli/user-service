package com.kodlakodlat.userservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "user")
@RequiredArgsConstructor
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "user_uuid", length = 200)
    String userId;
    @Column(name = "user_name")
    String userName;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "full_name")
    String fullName;
    @Column(name = "profile_picture")
    String profilePicture;
    @Column(name = "bio")
    String bio;
    @Column(name = "location")
    String location;
    @Column(name = "skills")
    String skills;
    @Column(name = "experience")
    String experience;
    @Column(name = "education")
    String education;
    @Column(name = "registration_date")
    Date registrationDate;
    @Column(name = "last_login")
    Date lastLogin;
    @Column(name = "is_verified")
    boolean isVerified;

}
