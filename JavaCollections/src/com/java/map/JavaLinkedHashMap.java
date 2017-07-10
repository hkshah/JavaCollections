package com.java.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * All three classes implement the Map interface and offer mostly the same functionality.
 * The most important difference is the order in which iteration through the entries will happen:
 * ----------------------------------------------------------------------------------------------
 * LinkedHashMap will iterate in the order in which the entries were put into the map
 */

public class JavaLinkedHashMap {

	public static void main(String args[]) {

		LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
		hashMap.put("0", "Zero");
		hashMap.put("1", "One");
		hashMap.put("7", null);
		hashMap.put("3", "Three");
		hashMap.put("8", "8");
		hashMap.put("9", "9");
		hashMap.put("6", null);
		hashMap.put("10", "10");
		hashMap.put("4", "Four");
		hashMap.put("Ten", "10");
		hashMap.put("2", "Two");
		hashMap.put("5", "Five");
		hashMap.put(null, "10");
		hashMap.put("0", "0");
		hashMap.put(null, "null");

		System.out.println("Traversing HashMap through For Each Loop");
		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();

		System.out.println("Traversing HashMap through For Each Loop Using Collection");
		Collection<String> col = hashMap.values();
		for (String str : col) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("Traversing HashMap through Iterator");
		Iterator<String> itr = hashMap.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(hashMap.get(itr.next()));
		}
	}
}