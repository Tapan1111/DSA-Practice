package com.tapan.dsa.string;

import java.util.HashMap;

public class DescendingByFrequency {
	public static void main(String[] args) {
		String str = "Banana";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			Integer val = map.get(c);
			if (val != null) {
				map.put(c, new Integer(val + 1));
			} else {
				map.put(c, 1);
			}
		}

	}
}
