package com.vit.exceptions;

public class SimpleException {
	
	public static void main(String[] args) {
		int a =5;
		try {
			a = 5/0;
		}catch(Exception e) {

			e.printStackTrace();
			System.out.println("Exception Handling");
		}
		
	}

}
