package com.tapan.dsa.hashMap;

import java.util.HashMap;

public class MinimumWindowSubsrtring {
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));

	}

	public static String minWindow(String s, String t) {
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character str : t.toCharArray()) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		System.out.println(map);
		int i = 0;
		int j = 0;
		int count = map.size();
		System.out.println(count);
		while (j < s.length()) {
			if (map.containsKey(s.charAt(j))) {
				int currVal = map.get(s.charAt(j));
				map.put(s.charAt(j), currVal - 1);
				if (map.get(s.charAt(j)) == 0) {
					count = count - 1;
				}
			}
			if (count == 0) {
				while (count == 0) {
					char ch2 = s.charAt(i);
					if (map.containsKey(ch2)) {
						map.put(ch2, map.get(ch2) + 1);
						if (map.get(ch2) == 1) {
							count++;
							if (j - i + 1 < minLength) {
								minLength = j - i + 1;
								start = i;
							}
						}
					}
					i++;
				}
			}
			j++;
		}
		if (minLength == Integer.MAX_VALUE) {
			return " ";
		}
		return s.substring(start, start + minLength);

	}

}
