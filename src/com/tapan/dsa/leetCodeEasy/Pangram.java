package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class Pangram {
	public static void main(String[] args) {
//		String s = "bosscoder quiz practice code";
//		String[] str = s.split(" ");
//		String newStr = "";
//		System.out.println(Arrays.toString(str));
//		for (int i = 0; i < str.length; i++) {
//			newStr = str[i] + " " + newStr;
//		}
//		System.out.println(newStr);
		String s = "abcba";
		String temp;
		temp = s;
		System.out.println(s);
		char[] ch = s.toCharArray();
		String str = "";
		System.out.println(Arrays.toString(ch));
		for (int i = ch.length - 1; i >= 0; i--) {
			str = str + ch[i];
		}
		System.out.println(str);
		if (temp == str) {
			System.out.println("True");
		}


	}

//	public String solve(String s) {
//		StringBuilder reverseSentence = new StringBuilder(s).reverse();
//		System.out.println(reverseSentence);
//		return s;
//
//	}

}
