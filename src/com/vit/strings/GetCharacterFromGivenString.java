package com.vit.strings;

public class GetCharacterFromGivenString {
	
	public static void main(String[] args) {
		GetCharacterFromGivenString getCharacterFromGivenString = new GetCharacterFromGivenString();
		String name = "Vizag";
		char chr[] = name.toCharArray();
		char myfav = 'z';
		
		for(int i=0; i<chr.length; i++) {
			if(myfav == chr[i]) {
				System.out.println("get character ==== " + chr[i]);
			} else {
				System.out.println("Char not present");
			}
		}
		
	}

}
