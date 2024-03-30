package com.example.Blog_App.services;

import java.util.List;



import com.example.Blog_App.payloads.CategoryDto;


public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer category);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	
	//get all
	List<CategoryDto> getCategories();

}
