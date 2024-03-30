//package com.example.Blog_App.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.Blog_App.entities.User;
//import com.example.Blog_App.exceptions.EmailNotFoundException;
//import com.example.Blog_App.exceptions.ResourceNotFoundException;
//import com.example.Blog_App.repositories.UserRepo;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//
//	@Autowired
//	private UserRepo userRepo;
//
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		// loading user from database by username
//		
//		User user = this.userRepo.findByEmail(username)
//				.orElseThrow(() -> new EmailNotFoundException("user", "email", username));
//		
//		return user;
//	}
//
//}
