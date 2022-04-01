package com.vit.loopsAndConditions;

public class Conditions {

	public static void main(String[] args) {
		int age = 1243213;

		if (age > 18) {
			System.out.println("Eligible for applying Driving licence");
		} else if (age > 80 || age < 18) {
			System.out.println("Not eleigible");
		}else {
			System.out.println("Age should be given in numeric");
		}
		
		int i = 1;
		while(i < 5) {
			i++;
			System.out.println("i === " + i);
		}
		
		System.out.println("***********************************************");
		int j = 6;
		
		do {
			j++;
			System.out.println("J === " + j);
		}while(j<5);
		System.out.println("***********************************************");
		
		for(int k=0; k<10; k++) {
			System.out.println("K === " + k);
		}
		
		System.out.println("***********************************************");
		
		String name = "Hyderabad";
		char c = 'y';
		char[] chr = name.toCharArray();
		
		for(int l=0; l<chr.length; l++ ) {
			if(c == chr[l]) {
				System.out.println("char === " + chr[l]);
				break;
			} else {
				System.out.println("Given character not in the String");
			}
		}
		
		System.out.println("***********************************************");
		
		String str = "Selenium";
		
		for(char m: str.toCharArray()) {
			//System.out.println("m === " + m);
			if(m == 'l') {
				System.out.println("expected char === " + m);
			}

		}
		
		String student = "Usha";
		
		switch(student) {
		case "Saisha": System.out.println("Studying B.Tech 2nd Year");
		break;
		case "Tanu": System.out.println("Completed Bachelors");
		break;
		default : 
			System.out.println("Working");
		}
		
		
		int[] arr = {1,2,3,4,5,6};
		for(int x : arr) {
			System.out.println(" x == " + x);
		}

	}
}
