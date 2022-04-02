package com.vit.exceptions;

public class ChildException {
	
	public void displayScreen() {
		System.out.println("Watch Movie");
	}

	public static void main(String[] args) {

		ChildException childException = null;
		
		int a = 5;
		int x[] = new int[5];
		String name = null;
		
		try {
			a = 5 / 2;
			System.out.println("a value == " + a);
			
			x[4] = 10;
			System.out.println("x[4] == " + x[4]);
			
			System.out.println("name value "+ name);
			
			childException.displayScreen();
			
		} 
		
		catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("NullPointer Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException aiob) {
			aiob.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
		
		catch(IndexOutOfBoundsException ioub) {
			ioub.printStackTrace();	
			System.out.println("IndexOutOfBounds Exception");
		}
		
		catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Arithmetic Exception");
		}
		
		
		catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("Runtime Exception");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handling");
		}
		

		
	}

}
