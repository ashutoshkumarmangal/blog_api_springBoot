package com.example.Blog_App.payloads;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class CommentDto {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String content;
}
