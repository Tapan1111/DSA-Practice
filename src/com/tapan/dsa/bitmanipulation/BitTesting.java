package com.tapan.dsa.bitmanipulation;

public class BitTesting {
	public static void main(String[] args) {
		int a = 10;
		int b = a << 1;
		int c = a << 2; // c = a*2^2; ==> 40
//		System.out.println(b);
//		System.out.println(c);
		int t = a >> 2;
//		System.out.println(t);
		int n = 8;
		System.out.println(isOdd(n));
		System.out.println(isEven(n));

	}

	public static boolean isEven(int n) {
		return (n & 1) == 0;
	}

	public static boolean isOdd(int k) {
		return (k & 1) == 1;
	}

}
