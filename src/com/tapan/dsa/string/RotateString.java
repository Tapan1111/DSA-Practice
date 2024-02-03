package com.tapan.dsa.string;

public class RotateString {
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		int n = s.length() / 2;
		for (int i = 0; i < n; i++) {
			System.out.println(s.charAt(i));

		}
	}
}
