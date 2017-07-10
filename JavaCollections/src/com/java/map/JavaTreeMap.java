package com.java.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

/*
 * All three classes implement the Map interface and offer mostly the same functionality.
 * The most important difference is the order in which iteration through the entries will happen:
 * ----------------------------------------------------------------------------------------------
 * TreeMap will iterate according to the "natural ordering" of the keys according to their
 * compareTo() method (or an externally supplied Comparator). Additionally, it implements the
 * SortedMap interface, which contains methods that depend on this sort order. 
 */

public class JavaTreeMap {

	public static void main(String args[]) {

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("0", "Zero");
		treeMap.put("1", "One");
		treeMap.put("7", null);
		treeMap.put("3", "Three");
		treeMap.put("8", "8");
		treeMap.put("9", "9");
		treeMap.put("6", null);
		treeMap.put("10", "10");
		treeMap.put("4", "Four");
		treeMap.put("Ten", "10");
		treeMap.put("2", "Two");
		treeMap.put("5", "Five");
		// hashMap.put(null, "10"); Cannot Have null keys
		treeMap.put("0", "0");
		// hashMap.put(null, "null");

		System.out.println("Traversing HashMap through For Each Loop");
		Set<Map.Entry<String, String>> entrySet = treeMap.entrySet();
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();

		System.out.println("Traversing HashMap through For Each Loop Using Collection");
		Collection<String> col = treeMap.values();
		for (String str : col) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("Traversing HashMap through Iterator");
		Iterator<String> itr = treeMap.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(treeMap.get(itr.next()));
		}
	}
}