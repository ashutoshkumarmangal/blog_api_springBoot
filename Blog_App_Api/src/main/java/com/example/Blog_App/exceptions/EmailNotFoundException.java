package com.example.Blog_App.exceptions;

public class EmailNotFoundException extends RuntimeException  {

	String resourceName;
	String fieldName;
	String fieldValue;
	
	public EmailNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : %s",resourceName ,fieldName ,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
