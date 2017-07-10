package com.java.list;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String args[]) {

		LinkedList<Integer> evenIntegers = new LinkedList<Integer>();
		evenIntegers.add(2);
		evenIntegers.add(4);
		evenIntegers.add(6);
		evenIntegers.add(8);
		evenIntegers.add(10);

		LinkedList<Integer> oddIntegers = new LinkedList<Integer>();
		oddIntegers.add(1);
		oddIntegers.add(3);
		oddIntegers.add(5);
		oddIntegers.add(7);
		oddIntegers.add(9);

		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.add(0);
		integers.addAll(oddIntegers);
		integers.addAll(evenIntegers);

		System.out.println("Traversing LinkedList through For Loop");
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}
		integers.removeAll(evenIntegers); // Removes a Collection
		System.out.println();

		System.out.println("Traversing LinkedList through For Each Loop");
		for (int i : integers) {
			System.out.println(i);
		}
		integers.remove("Rekha");// Removes a single Element
		System.out.println();

		System.out.println("Traversing LinkedList through Iterator");
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
