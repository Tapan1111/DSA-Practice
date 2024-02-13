package com.tapan.dsa.string;

import java.util.Arrays;

public class ReverseWordInAGivenString {
	public static void main(String[] args) {
//		String str = "silent";
//		String str1 = "listen";
//
//		char[] ch = str.toCharArray();
//		char[] ch1 = str1.toCharArray();
//		System.out.println("for silent :" + Arrays.toString(ch));
//		System.out.println("for listen :" + Arrays.toString(ch1));
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		System.out.println("for silent :" + Arrays.toString(ch));
//		System.out.println("for listen :" + Arrays.toString(ch1));

		String str = "bosscoder quiz practice code";
		ReverseWordInAGivenString word = new ReverseWordInAGivenString();
		word.solve(str);
		System.out.println(word.solve(str));
	}

	public static String solve(String str) {
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		String newStr = "";
		for (int i = 0; i < arr.length; i++) {
			newStr = arr[i] + " " + newStr;
		}
		return newStr;

	}
}
