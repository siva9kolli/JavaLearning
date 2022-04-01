package com.vit.keywords;

public class Child extends Parent{

	final int p = 1;
	

	public void running() {
		System.out.println("running on thread mill");
		
	}
	
	public static void main(String[] args) {
		
		// upcasting
		Parent parent;
		parent = new Child(); 
		parent.gym();
		parent.test();
		
	
		// downcasting
		Child child =  (Child) parent;  
		child.running();

	}

}
