package com.java.list;

import java.util.Vector;
import java.util.Iterator;

public class JavaVector {

	public static void main(String args[]) {

		Vector<String> maleVector = new Vector<String>();
		maleVector.add("Ram");
		maleVector.add("Shyam");
		maleVector.add("Raju");
		maleVector.add("Ajay");

		Vector<String> femaleVector = new Vector<String>();
		femaleVector.add("Rani");
		femaleVector.add("Jaya");
		femaleVector.add("Shusma");
		femaleVector.add("Rekha");

		Vector<String> humanVector = new Vector<String>();
		humanVector.addAll(0, maleVector);
		humanVector.addAll(maleVector.size(), femaleVector);

		System.out.println("Traversing Vector through For Loop");
		for (int i = 0; i < humanVector.size(); i++) {
			System.out.println(humanVector.get(i));
		}
		humanVector.removeAll(maleVector); // Removes a Collection
		System.out.println();

		System.out.println("Traversing Vector through For Each Loop");
		for (String str : humanVector) {
			System.out.println(str);
		}
		humanVector.remove("Rekha");// Removes a single Element
		System.out.println();

		System.out.println("Traversing Vector through Iterator");
		Iterator<String> iterator = humanVector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
