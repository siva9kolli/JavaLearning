package com.vit.oops;

public class Child extends Parent {

	public static void main(String[] args) {
		int c = 0;
		Child child = new Child();
		child.test1();
		child.test2();
		c = child.a + child.b;
		System.out.println("c value === " + c);

		child.sum(2, 2, 2);
		child.mul(4.5, 5);
		child.mul(4, 5);
		child.div(20, 3);
	}
	
	
	public void div(int a, int b) {
		System.out.println("remiander value is === " + (a%b));
	}
	

	public void sum(int a, int b) {
		System.out.println("Sum of a & b === " + (a + b));
	}

	public void sum(int c, int d, int e) {
		System.out.println("Sum of a & b & c === " + (c + d + e));
	}

	public void sum(int c, int d, int e, int f) {

	}

	public void mul(int x, int y) {
		System.out.println("Multiplication of x & y === " + (x * y));
	}

	public void mul(double x, int y) {
		System.out.println("Multiplication of x & y === " + (x * y));
	}
	
	public int sub(int a, int b) {
		System.out.println("Difference between a & b === " + (a-b) );
		return a-b;
	}
	
	public double sub1(int a, int b) {
		System.out.println("Difference between a & b === " + (a-b) );
		return a-b;
	}

}
