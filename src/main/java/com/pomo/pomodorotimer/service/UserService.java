package com.pomo.pomodorotimer.service;

import com.pomo.pomodorotimer.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updatePasswordById(Long id, String password);
}
