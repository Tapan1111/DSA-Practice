package com.tapan.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class DescendingOrderOfFrequency {
	public static void main(String[] args) {
//		String s = "Banana";
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			char alp = s.charAt(i);
//			Integer value = map.get(alp);
//			if (value == null) {
//				map.put(alp, 1);
//			} else {
//				map.put(alp, (map.get(alp) + 1));
//			}
//		}
//		System.out.println(map);
		printInDescendingOrder("Banana");

	}

	public static void printInDescendingOrder(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		System.out.println(map);
	}
}
