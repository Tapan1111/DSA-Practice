package com.tapan.dsa.maths;

public class ReverseNum {
	public static void main(String[] args) {
		ReverseNum reverse = new ReverseNum();
		int n = 315;
		System.out.println(reverse.solve(n));

	}

	public static int solve(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		return rev;
	}

}
