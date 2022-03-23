package com.vit.strings;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		
		String name = "vizag";
		char chr[] = name.toCharArray();
		
		Arrays.sort(chr);
		
//		System.out.println("chr === " + chr);
//		for(int i=0; i<chr.length; i++) {
//			System.out.println(chr[i]);
//		}
		
		String sortedString = new String(chr);
		System.out.println(sortedString); 		
	}

}
