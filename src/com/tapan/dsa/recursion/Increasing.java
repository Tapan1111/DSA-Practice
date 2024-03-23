package com.tapan.dsa.recursion;

public class Increasing {
	public static void main(String[] args) {
		System.out.println(factorial(5));


	}

	public static void result(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		result(n - 1);
		System.out.println(n);
	}

	public static void printDecreasingIncreasing(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n - 1);
		System.out.println(n);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
