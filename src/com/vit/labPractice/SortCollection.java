package com.vit.labPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SortCollection {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		arrayList.add("Ball");
		arrayList.add("Apple");
		arrayList.add("Zaggle");
		arrayList.add("Maps");
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("remove the first char === " + itr.next().toString().substring(2));
		}

		Collections.sort(arrayList);

		System.out.println("arrayList === " + arrayList);

		Map map = new HashMap();

		map.put("1001", "Java");
		map.put("1002", "Python");

		int bookId = 1501;
		String bookTitle = "Java";

		if (bookId > 1500 || bookId < 0) {
			try {
				throw new BookIDException();
			} catch (BookIDException e) {
				e.printStackTrace();
			}
		}

		if (bookTitle.equals("Java")) {
			try {
				throw new BookNameException();
			} catch (BookNameException e) {
				e.printStackTrace();
			}
		}

	}
}
