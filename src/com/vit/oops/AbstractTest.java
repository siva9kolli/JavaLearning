package com.vit.oops;

public class AbstractTest extends AbstractClass {

	
	public void test2() {
		System.out.println("Test2 method executing");
	}
	
	public static void main(String[] args) {
		AbstractTest absTest = new AbstractTest();
		absTest.test1();
		absTest.test2();
		
		
		AbstractClass absClass = new AbstractTest();
		absClass.test1();
		absClass.test2();
	}
	
}
