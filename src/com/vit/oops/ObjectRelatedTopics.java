package com.vit.oops;

public class ObjectRelatedTopics {
	

	
	public void testExecution() {
		System.out.println("Executing main method");
	}
	
	public void sumOfTwoNumber() {
		int a = 5,b = 4 ,c;
		c = a+b;
		System.out.println("c Value =" + c);
		System.out.println("Test Abc === XYZ");
		System.out.println(c);
		
	}
	
	public static void sumOfThreeNumbers() {
		int a = 5,b = 4 ,e, d = 10;
		e = a+b+d;
		System.out.println("e Value =" + e);
		System.out.println("Test Abc === XYZ");
		System.out.println(e);
		
	}
	
	public ObjectRelatedTopics() {
		int a=10, b=10, c=10, d;
		d = a+b+c;
		System.out.println("d value ==== " + d);
	}
	
	public ObjectRelatedTopics(String name, int id) {
		System.out.println("Name of the Student === " + name);
		System.out.println("Id of the Student === " + id);
	}
	
	public ObjectRelatedTopics(String name, int id, String collageName) {
		System.out.println("Name of the Student === " + name);
		System.out.println("Id of the Student === " + id);
		System.out.println("College Name === " + collageName);
	}
	
	public static void main(String args[]) {
		StaticClass1.sum();
		sumOfThreeNumbers();
		
		ObjectRelatedTopics objectRelatedTopics = new ObjectRelatedTopics("SaiSha", 40);
		ObjectRelatedTopics objectRelatedTopics1 = new ObjectRelatedTopics("SaiSha", 40, "VIT");
		ObjectRelatedTopics objectRelatedTopics2 = new ObjectRelatedTopics();
		objectRelatedTopics.testExecution();
		objectRelatedTopics1.sumOfTwoNumber();	
	}
	

}
