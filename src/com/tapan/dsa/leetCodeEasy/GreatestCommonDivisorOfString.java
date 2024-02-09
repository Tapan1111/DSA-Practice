package com.tapan.dsa.leetCodeEasy;

public class GreatestCommonDivisorOfString {
	public static void main(String[] args) {
		String s1 = "ABCABCABC";
		String s2 = "ABCABC";
		String s3 = "Code";
		System.out.println(gcdOfString(s1, s3));

	}

	public static String gcdOfString(String str1, String str2) {
		if ((str1 + str2).equals(str2 + str1)) {
			int a = str1.length();
			int b = str2.length();
			int gcd = gcd(a, b);
			return str1.substring(0, gcd);
		} else {
			return "No";
		}
	}

	public static int gcd(int a, int b) {
		while (b % a != 0) {
			int rem = b % a;
			b = a;
			a = rem;
		}
		return a;
	}
}
