package com.tapan.dsa.recursion;

public class AddWithoutOperators {
	public static void main(String[] args) {
		System.out.println(add(6, 4));

	}

	public static int add(int a, int b) {
		if (b == 0) {
			return b;
		}
		return add(a, b - 1) + a;
	}

}
