package com.tapan.dsa.recursion;

import java.util.Scanner;

public class PrintDecreasinIncreasing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(powerLog(x, n));
	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	public static int powerLog(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int hp = power(x, n/2);
		int ans = hp*hp;
		if(n % 2 == 1) {
			ans = ans * x;
		}
		return ans;
	}
}
