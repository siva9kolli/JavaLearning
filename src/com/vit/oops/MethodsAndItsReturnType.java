package com.vit.oops;

public class MethodsAndItsReturnType {
	public String name = "Sai Sha";
	public int a =5, b=5,c;
	public boolean t = true;
	
	
	public String getUserName() {
		System.out.println("username === " + name);
		return name;
	}
	
	public int getSumOfValues() {
		c = a+b;
		System.out.println("c value === " + c);
		return c;
	}
	
	public boolean getStatus() {
		System.out.println("t value == " + t);
		return t;
	}
	
	
	public static void main(String[] args) {
		MethodsAndItsReturnType methodsAndItsReturnType = new MethodsAndItsReturnType();
		methodsAndItsReturnType.getUserName();
		methodsAndItsReturnType.getSumOfValues();
		methodsAndItsReturnType.getStatus();
	}

}
