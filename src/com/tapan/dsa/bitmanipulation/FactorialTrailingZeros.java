package com.tapan.dsa.bitmanipulation;

public class FactorialTrailingZeros {
	public static void main(String[] args) {
		int n = 40;
		System.out.println(solve(n));

	}

	public static int solve(int n) {
		int count = 0;
		while (n > 0) {
			// as the number of trailing zeros depenf on how many 5 present int he factorial
			// of that n
			// number as 5! = 120 and 10! = 3628800
			n = n / 5;
			count++;
		}
		return count;
	}

}
