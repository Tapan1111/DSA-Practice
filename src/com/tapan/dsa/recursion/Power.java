package com.tapan.dsa.recursion;

public class Power {
	public static void main(String[] args) {
		System.out.println(power(2, 16));

	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * pow(a, b - 1);
	}

	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int hp = pow(a, b / 2);
		if (b % 2 == 0) {
			return hp * hp;
		}

		return hp * hp * a;

	}

}
