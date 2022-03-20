package com.vit.strings;

public class UnderstandStrings {
	
	public static void main(String[] args) {
		String city = "Vijayawada";
		String vilage = "Vijayawada";
		
		if(city.equals(vilage)) {
			System.out.println("Both city and village are same");
		} else {
			System.out.println("Both city and village are different");
		}
		System.out.println("**********************************************************");
		
		if(city == vilage) {
			System.out.println("Both city and village are same");
		} else {
			System.out.println("Both city and village are different");
		}
		
		System.out.println("**********************************************************");
		
		System.out.println("Compare Strings ==== " + city.compareTo(vilage));
		System.out.println("**********************************************************");
		
		String city1;
		city1 = city.concat(city);
		System.out.println("Output city1 === " + city);
		System.out.println("Output city1 === " + city1);
		System.out.println("Output vilage === " + vilage);
		
		
		String state = new String("Andhra Pradesh");
		String mandal = new String("Andhra Pradesh");
		System.out.println("state === " + state);
		System.out.println("mandal === " + mandal);
		
		System.out.println("**********************************************************");
		if(state.equals(mandal)) {
			System.out.println("Both state and mandal are same");
		} else {
			System.out.println("Both state and mandal are different");
		}
		
		System.out.println("**********************************************************");
		if(state == mandal) {
			System.out.println("Both state and mandal are same");
		} else {
			System.out.println("Both state and mandal are different");
		}
		System.out.println("**********************************************************");
		
		System.out.println("Compare Strings ==== " + state.compareTo(mandal));
		
		System.out.println("Compare Strings ==== " + state.compareTo("ANDHRA PRADESH"));
		
		System.out.println("Compare Strings ==== " + state.compareTo("Telangana"));
		
		
	}

}
