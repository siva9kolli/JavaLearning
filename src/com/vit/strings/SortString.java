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

		int arr[] = { 1, 7, 9, 2, 6, 3, 8 };
		Arrays.sort(arr);
		int temp = 0;
		int j;

		for (int k = 0; k < arr.length; k++) {
			System.out.println("Sorted Array === " + arr[k]);
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (j = arr[i + 1]; i < arr.length-1; i++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//				}
//				System.out.println("temp[i] === " +temp);
//			}
//
//		}
	}

}
