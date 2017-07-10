package com.java.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class JavaLinkedHashSet {

	public static void main(String args[]) {

		LinkedHashSet<Integer> evenLinkedHashSet = new LinkedHashSet<Integer>();
		evenLinkedHashSet.add(null);
		evenLinkedHashSet.add(0);
		evenLinkedHashSet.add(8);
		evenLinkedHashSet.add(4);
		evenLinkedHashSet.add(2);
		evenLinkedHashSet.add(6);
		evenLinkedHashSet.add(10);

		LinkedHashSet<Integer> oddLinkedHashSet = new LinkedHashSet<Integer>();
		oddLinkedHashSet.add(0);
		oddLinkedHashSet.add(1);
		oddLinkedHashSet.add(7);
		oddLinkedHashSet.add(5);
		oddLinkedHashSet.add(9);
		oddLinkedHashSet.add(3);
		oddLinkedHashSet.add(null);

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		hashSet.addAll(oddLinkedHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenLinkedHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(oddLinkedHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenLinkedHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}