package com.tapan.dsa.maths;

public class Gcd {
	public static void main(String[] args) {
		Gcd gcd = new Gcd();
		int a = 24;
		int b = 30;
		System.out.println(gcd.getGcd(a, b));

	}

	public int getGcd(int a, int b) {

		if (a < b) {
			swap(a, b);
		}
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;

		}
		return a;
	}

	private void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}

}
