package com.tapan.dsa.BinarySearch;

public class RecursionExample {
	public static void main(String[] args) {
		
		// recFun(1);
		recFunction(5);

	}

	public static int recFun(int n) {
		System.out.println(n);
		if (n == 10) {
			return n;

		}

		return recFun(n + 1);
	}

	public static void recFunction(int n) {
		if (n == 0) {
			return;
		}
		recFunction(n - 1);
		System.out.println(n);
	}

}
