package com.tapan.dsa.recursion;

public class Multiplyab {
	public static void main(String[] args) {
		System.out.println(halfpower(2, 5));

	}

	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return power(a, b - 1) * a;
	}

	public static int mult(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}

		return mult(a, b - 1) + a;
	}

	public static int halfpower(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int hp = halfpower(a, b / 2);
		if (b % 2 == 0) {
			return hp * hp;
		} else {
			return hp * hp * a;
		}
	}

}
