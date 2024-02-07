package com.tapan.dsa.maths;

public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber number = new ArmstrongNumber();
		int n = 371;
		System.out.println(number.check(n));

	}

	public static boolean check(int n) {
		int rem = 0;
		int temp = n;
		int sum = 0;
		while (n != 0) {

			rem = n % 10;
			n = n / 10;
			sum = sum + (rem * rem * rem);
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

}
