package com.tapan.dsa.hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Exercise1 {
	public static void main(String[] args) {
		String str = "This is Tapan Behera " + "This is Hustling Time";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));

		for (char ch : charArray) {
			Integer val = map.get(ch);
			if (val == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, val + 1);
			}

		}
		System.out.println(map);
		System.out.println("-------------------------------------");
		
		HashMap<String, Integer> strmap = new HashMap<String, Integer>();
		String[] strArray = str.split(" ");
		System.out.println(Arrays.toString(strArray));
		for (String word : strArray) {
			Integer val = strmap.get(word);
			if (val == null) {
				strmap.put(word, 1);
			} else {
				strmap.put(word, val + 1);
			}

		}
		System.out.println(strmap);

	}

}
