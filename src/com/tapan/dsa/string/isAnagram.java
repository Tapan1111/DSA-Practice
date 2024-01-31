package com.tapan.dsa.string;

import java.util.Arrays;

public class isAnagram {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "avaj";
		char[] arr = s1.toCharArray();
		System.out.println(Arrays.toString(arr));
		StringBuilder sb = new StringBuilder(s2);
		System.out.println(s2);
		for (char c : arr) {
			int index = sb.indexOf(String.valueOf(c));
			if (index != -1) {
				sb.deleteCharAt(index);
			}
		}
		if (sb.length() == 0) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not An Anagram");
		}

	}

}
