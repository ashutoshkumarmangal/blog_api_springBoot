package com.example.Blog_App.services;

import java.util.List;

import com.example.Blog_App.payloads.UserDto;
import com.example.Blog_App.payloads.UserResponse;

public interface UserService {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	UserResponse getAllUsers(Integer pageNumber, Integer pageSize);
	
	void deleteUser(Integer userId);
}
