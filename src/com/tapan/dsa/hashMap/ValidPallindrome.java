package com.tapan.dsa.hashMap;

public class ValidPallindrome {
	public static void main(String[] args) {
		String s = "nagrama";
		String t = "anagrap";
		System.out.println(anagram(s, t));

		
	}

	public static boolean anagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] attendanceArray = new int[26];

		for (int i = 0; i < s.length(); i++) {
			attendanceArray[s.charAt(i) - 'a']++;
			attendanceArray[t.charAt(i) - 'a']--;
		}
		for (int count : attendanceArray) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

}
