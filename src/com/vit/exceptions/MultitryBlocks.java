package com.vit.exceptions;

public class MultitryBlocks {
	
	public static void main(String[] args) {
		int a =5;
		
		try {
			a = 5/1;
			
			try {
				a = 5/0;
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Nested Try block Exception Handling");
			}
			
			try {
				
			}catch(Exception e) {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handling");
		}
		finally {
			System.out.println("Finally Block");
		}
		
	}

}
