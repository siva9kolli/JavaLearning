package com.vit.strings;

public class ReverseAString {
	
	public static void main(String[] args) {
		ReverseAString reverseAString = new ReverseAString();
		
		
		String city = "Vijayawada";
		char[] chr = city.toCharArray();
		String reverse = "";
		
		int lenghtOfTheString = city.length();
		
		// array = {'a','b','c','d'}
		
		for(int i=lenghtOfTheString-1; i>=0; i--) {
			reverse = reverse+   chr[i];
			System.out.println("reversed String ===== " + reverse);
		}
		
		//System.out.println("reversed String ===== " + reverse);
		
	}

}
