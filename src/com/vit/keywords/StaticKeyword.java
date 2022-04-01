package com.vit.keywords;

public class StaticKeyword {
	int empId;
	String name; 
	static String companyName = "MotivityLabs";
	
	public StaticKeyword(int emp, String name) {
		empId = emp;
		this.name = name;
	}
	
	
	public void empRegistration() {
		System.out.println("Employee Registration == " + empId  + " :: " + name + " :: " + companyName  );
	}

	public static void main(String args[]) {
		StaticKeyword staticKeyword  = new StaticKeyword(10, "Ram");
		StaticKeyword staticKeyword1  = new StaticKeyword(11, "Sita");
		staticKeyword.empRegistration();
		staticKeyword1.empRegistration();

	}
}
