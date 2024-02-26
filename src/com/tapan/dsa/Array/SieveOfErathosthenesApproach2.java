package com.tapan.dsa.Array;

public class SieveOfErathosthenesApproach2 {
	public static void main(String[] args) {
		SieveOfErathosthenesApproach2 ap2 = new SieveOfErathosthenesApproach2();
		int n = 100;
		System.out.println(ap2.count(n));

	}

	public int count(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public boolean isPrime(int n) {
		boolean check = true;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				check = false;
			}
		}
		return check;
	}

}
