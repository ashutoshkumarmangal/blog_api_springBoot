package com.example.Blog_App.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Blog_App.entities.Category;
import com.example.Blog_App.entities.Post;
import com.example.Blog_App.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
//	List<Post> findByTitleContaining(String title);  //this is working testing the other way
	
	
	@Query("select p from Post p where p.title like :key")
	List<Post>searchByTitle(@Param("key") String title);
}
