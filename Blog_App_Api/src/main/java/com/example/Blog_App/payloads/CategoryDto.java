package com.example.Blog_App.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	
	@NotEmpty
	@Size(min = 4, message = "Title must be of 3 characters")
	private String categoryTitle;
	
	@NotEmpty(message = "Description must not be empty")
	@Size(min =10)
	private String categoryDescription;
	
	

}
