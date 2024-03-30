package com.example.Blog_App.services;

import com.example.Blog_App.payloads.CommentDto;


public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);
}
