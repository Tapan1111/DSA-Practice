package com.tapan.dsa.maths;

public class ReverseString {
	public static void main(String[] args) {
		solve("abc");
		
	}

	public static void solve(String str) {
		helper(str,0);
	}

	private static void helper(String str, int i) {
		if (i >= str.length()) {
			return;
		}
		
		helper(str, i + 1);
		System.out.print(str.charAt(i));
	}

}
