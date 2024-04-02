package com.tapan.dsa.string;

import java.util.HashMap;

public class IsomorphicString {
	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		System.out.println(isIsomorphic(s, t));

	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);

			if (!map.containsKey(original)) {
				if (!map.containsValue(replacement)) {
					map.put(original, replacement);
				} else {
					return false;
				}
			} else {
				char mappedChar = map.get(original);
				if (mappedChar != replacement) {
					return false;
				}
			}
		}

		return true;
	}

}
