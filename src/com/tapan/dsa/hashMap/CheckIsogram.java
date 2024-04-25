package com.tapan.dsa.hashMap;

import java.util.HashMap;

public class CheckIsogram {
	public static void main(String[] args) {
		String data = "machine";
		System.out.println(check(data));
	}

	public static boolean check(String data) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character chr : data.toCharArray()) {
			map.put(chr, map.getOrDefault(chr, 0) + 1);
		}
		System.out.println(map);
		for (Character chr : data.toCharArray()) {
			if (map.get(chr) != 1) {
				return false;
			}
		}
		return true;
	}

}
