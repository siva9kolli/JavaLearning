package com.vit.strings;

public class ReverseAString {

	/**
	 * Java Program to Get a Character from the Given String
	 * 
	 * Java Program to Reverse a String
	 * 
	 * Java Program to Sort a String
	 * 
	 * Java Program to Swapping every Pair of Characters, can take even number of
	 * inputs (Eg. JAVAàajav)
	 * 
	 * Java Program to Remove leading zeros (Eg. 0000187à187)
	 * 
	 * Java Program to Compare two strings
	 * 
	 * Java Program to Insert a string into another string
	 * 
	 * Java Program to concatenate two strings
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		ReverseAString reverseAString = new ReverseAString();

		String city = "Vijayawada";
		char[] chr = city.toCharArray();
		String reverse = "";

		int lenghtOfTheString = city.length();

		// array = {'a','b','c','d'}

		for (int i = lenghtOfTheString - 1; i >= 0; i--) {
			reverse = reverse + chr[i];
			// System.out.println("reversed String ===== " + reverse);
		}

		System.out.println("reversed String ===== " + reverse);

	}

}
