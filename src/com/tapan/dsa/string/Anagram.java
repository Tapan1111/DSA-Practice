package com.tapan.dsa.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "avaja";
		System.out.println(anagram(s1, s2));

	}

	public static boolean anagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}

}
