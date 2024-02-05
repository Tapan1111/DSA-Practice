package com.tapan.dsa.maths;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int gcd = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
