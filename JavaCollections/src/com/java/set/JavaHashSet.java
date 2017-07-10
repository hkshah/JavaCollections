package com.java.set;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {

	public static void main(String args[]) {

		HashSet<Integer> evenHashSet = new HashSet<Integer>();
		evenHashSet.add(null);
		evenHashSet.add(0);
		evenHashSet.add(8);
		evenHashSet.add(4);
		evenHashSet.add(2);
		evenHashSet.add(6);
		evenHashSet.add(10);

		HashSet<Integer> oddHashSet = new HashSet<Integer>();
		oddHashSet.add(0);
		oddHashSet.add(1);
		oddHashSet.add(7);
		oddHashSet.add(5);
		oddHashSet.add(9);
		oddHashSet.add(3);
		oddHashSet.add(null);

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(oddHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(oddHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");
		hashSet.addAll(evenHashSet);
		System.out.println(hashSet);
		System.out.println("---------------");

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}