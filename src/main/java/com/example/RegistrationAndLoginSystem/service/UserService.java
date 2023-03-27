package com.example.RegistrationAndLoginSystem.service;

import com.example.RegistrationAndLoginSystem.dto.UserDto;
import com.example.RegistrationAndLoginSystem.entity.User;


import java.util.List;

public interface UserService  {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
