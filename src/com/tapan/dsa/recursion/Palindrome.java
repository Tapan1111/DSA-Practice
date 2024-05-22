package com.tapan.dsa.recursion;

public class Palindrome {
	public static void main(String[] args) {
		String str = "racecare";
		int l = 0;
		int r = str.length()-1;
		System.out.println(isPalindrome2(str, l, r));
		
	}

	public static boolean isPalindrome(String str, int l, int r) {
		if (l >= r) {
			return true;
		}

		return (str.charAt(l) == str.charAt(r) && isPalindrome(str, l + 1, r - 1));
	}

	public static boolean isPalindrome2(String str, int s, int e) {
		if(s > e) {
			return true;
		}
		return (str.charAt(s) == str.charAt(e)) && isPalindrome2(str, s + 1, e - 1);
	}

}
