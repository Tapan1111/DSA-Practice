package com.tapan.dsa.recursion;

public class NumberOfStepsToReduceANumberToZero {
	public static int numberOfSteps(int num) {
		return helper(num, 0);
	}

	private static int helper(int num, int steps) {
		if (num == 0) {
			return steps;
		}
		if (num % 2 == 0) {
			return helper(num / 2, steps + 1);
		}
		return helper(num - 1, steps + 1);

	}

	public static void main(String[] args) {
		int num = 41;

		System.out.println(numberOfSteps(num));

	}

}
