package com.example.Blog_App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog_App.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
