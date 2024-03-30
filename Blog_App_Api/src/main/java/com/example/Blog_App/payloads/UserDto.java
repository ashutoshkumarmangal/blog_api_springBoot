package com.example.Blog_App.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Username must be of 4 characters")
	private String name;

	@Email
	@Pattern(regexp = "^(.+)@(\\S+)$", message = "Invalid Email!")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10)
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&*()-_+=])[A-Za-z\\d@#$%^&*()-_+=]{8,}$", message = "Password must be of 8 characters with letters, numbers, and special characters")
	private String password;

	@NotEmpty
	private String about;

}
