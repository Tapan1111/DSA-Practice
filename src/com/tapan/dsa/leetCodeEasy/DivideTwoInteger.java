package com.tapan.dsa.leetCodeEasy;

public class DivideTwoInteger {
	public static void main(String[] args) {
		DivideTwoInteger div = new DivideTwoInteger();
		System.out.println(div.divide(10, 3));

	}

	public int divide(int dividend, int divisor) {
		int rem = 0;
		int sum = 0;
		while (dividend != 0) {
			if (rem > 214748364 || (rem == 214748364)) {
				return 0;
			}
			if (rem < -214748364 || (rem == -214748364)) {
				return 0;
			}
			rem = dividend % divisor;
			sum = sum + rem;
		}
		return sum;

	}

}
