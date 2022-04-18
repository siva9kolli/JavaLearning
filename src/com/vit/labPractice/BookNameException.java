package com.vit.labPractice;

public class BookNameException extends Exception{

	public BookNameException() {
		super("Book Title not found");
	}
}
