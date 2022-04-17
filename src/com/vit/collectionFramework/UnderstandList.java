package com.vit.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnderstandList {

	public static void main(String[] args) {
		arraysTest();
	}

	public static void arraysTest() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		// System.out.println("Print 5th Element" + a[4]);

		String[] str = { "Java", "Python", "Ruby", "JavaScript" };
		// System.out.println("Print 1st element" + str[0]);

		char[] ch = { 'j', 'a', 'v', 'a' };

		List<String> alist = new ArrayList<String>();
		alist.add("Selenium");
		alist.add("Appium");
		alist.add("Core java");
		alist.add("Appium");

		System.out.println("alist === " + alist);

		System.out.println("*******************************************************************************");

		List blist = new ArrayList();

		blist.add("Neha");
		blist.add(99);
		blist.add(1000000);
		blist.add(30.7);

		System.out.println("blist === " + blist);

		System.out.println("*******************************************************************************");

		Set<String> aset = new HashSet<>();
		aset.add("Selenium");
		aset.add("Appium");
		aset.add("Core java");
		aset.add("Appium");

		System.out.println("aset === " + aset);

		System.out.println("*******************************************************************************");

	}

}
