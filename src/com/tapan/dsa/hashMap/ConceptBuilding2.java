package com.tapan.dsa.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ConceptBuilding2 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashymap = new HashMap<String, Integer>();
		System.out.println(hashymap);
		hashymap.put("Z", 1);
		hashymap.put("T", 100);
		hashymap.put("A", 10);
		hashymap.put("H", 1000);
		System.out.println(hashymap);
		// we can see here hashmap is unordered it does not follow any particular order
		System.out.println();

		LinkedHashMap<String, Integer> linkyHashyMap = new LinkedHashMap<String, Integer>();
		System.out.println(linkyHashyMap);
		linkyHashyMap.put("H", 1000);
		linkyHashyMap.put("A", 10);
		linkyHashyMap.put("Z", 1);
		linkyHashyMap.put("T", 100);
		// but here we can see LinkedHashMap follows the insertion order and accordingly
		// gives output on console
		System.out.println(linkyHashyMap);
		System.out.println();

		TreeMap<String, Integer> grootMap = new TreeMap<String, Integer>();
		System.out.println(grootMap);
		grootMap.put("H", 1000);
		grootMap.put("A", 10);
		grootMap.put("Z", 1);
		grootMap.put("T", 100);
		// and here in treemap it is sorted as you can see all the keys are in ascendng
		// order
		System.out.println(grootMap);
		System.out.println();
	}

}
