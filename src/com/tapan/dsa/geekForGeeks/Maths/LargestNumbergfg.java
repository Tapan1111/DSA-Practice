package com.tapan.dsa.geekForGeeks.Maths;

public class LargestNumbergfg {
	public static void main(String[] args) {
		int x = 15;
		int y = 3;
		System.out.println(cpFact(x, y));

	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		if (a == b) {
			return a;
		}
		if (a > b) {
			return gcd(a - b, b);
		}
		return gcd(a, b - a);

	}

	public static int cpFact(int x, int y) {
		while (gcd(x, y) != 1) {
			x = x / gcd(x, y);
		}
		return x;
	}


}
