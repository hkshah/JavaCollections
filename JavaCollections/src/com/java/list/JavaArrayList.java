package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {

	public static void main(String args[]) {

		ArrayList<String> maleArrayList = new ArrayList<String>();
		maleArrayList.add("Ram");
		maleArrayList.add("Shyam");
		maleArrayList.add("Raju");
		maleArrayList.add("Ajay");

		ArrayList<String> femaleArrayList = new ArrayList<String>();
		femaleArrayList.add("Rani");
		femaleArrayList.add("Jaya");
		femaleArrayList.add("Shusma");
		femaleArrayList.add("Rekha");

		ArrayList<String> humanArrayList = new ArrayList<String>();
		humanArrayList.addAll(0, maleArrayList);
		humanArrayList.addAll(maleArrayList.size(), femaleArrayList);

		System.out.println("Traversing ArrayList through For Loop");
		for (int i = 0; i < humanArrayList.size(); i++) {
			System.out.println(humanArrayList.get(i));
		}
		humanArrayList.removeAll(maleArrayList); // Removes a Collection
		System.out.println();

		System.out.println("Traversing ArrayList through For Each Loop");
		for (String str : humanArrayList) {
			System.out.println(str);
		}
		humanArrayList.remove("Rekha");// Removes a single Element
		System.out.println();

		System.out.println("Traversing ArrayList through Iterator");
		Iterator<String> iterator = humanArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}