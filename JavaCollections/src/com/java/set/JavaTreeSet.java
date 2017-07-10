package com.java.set;

import java.util.TreeSet;
import java.util.Iterator;

public class JavaTreeSet {

	public static void main(String args[]) {

		TreeSet<Integer> evenTreeSet = new TreeSet<Integer>();
		// oddTreeSet.add(null); Cannot Have null Values
		evenTreeSet.add(0);
		evenTreeSet.add(8);
		evenTreeSet.add(4);
		evenTreeSet.add(2);
		evenTreeSet.add(6);
		evenTreeSet.add(10);

		TreeSet<Integer> oddTreeSet = new TreeSet<Integer>();
		oddTreeSet.add(0);
		oddTreeSet.add(1);
		oddTreeSet.add(7);
		oddTreeSet.add(5);
		oddTreeSet.add(9);
		oddTreeSet.add(3);
		// oddTreeSet.add(null); Cannot Have null Values

		TreeSet<Integer> hashSet = new TreeSet<Integer>();
		hashSet.addAll(oddTreeSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenTreeSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(oddTreeSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenTreeSet);
		System.out.println(hashSet);
		System.out.println("---------------");

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}