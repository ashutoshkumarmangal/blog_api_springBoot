package com.example.Blog_App.repositories;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Blog_App.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{
	
	
	

}
