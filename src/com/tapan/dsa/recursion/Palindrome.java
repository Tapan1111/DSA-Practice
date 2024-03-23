package com.tapan.dsa.recursion;

public class Palindrome {
	public static void main(String[] args) {
		String str = "racecar";
		int l = 0;
		int r = str.length()-1;
		System.out.println(isPalindrome(str, l, r));
		
	}

	public static boolean isPalindrome(String str, int l, int r) {
		if (l >= r) {
			return true;
		}

		return (str.charAt(l) == str.charAt(r) && isPalindrome(str, l + 1, r - 1));
	}

}
