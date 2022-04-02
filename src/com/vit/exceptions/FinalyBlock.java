package com.vit.exceptions;

public class FinalyBlock {
	
	public static void main(String[] args) {
		int a =5;
		
		try {
			a = 5/2;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handling");
		}
		finally {
		a =5/a;
		System.out.println("a value === " + a);
		}
		
	}

}
