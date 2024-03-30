package com.example.Blog_App.payloads;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
	private List<UserDto> content;
	private int pageNumber;
	private int pageSize;
	
	private int totalPages;
	private long totalElements;
	private boolean lastPage;

}
