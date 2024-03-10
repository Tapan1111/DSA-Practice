package com.tapan.dsa.recursion;

public class FindGcdOfAnArray {
	public static void main(String[] args) {
		int[] arr = { 20, 25 };
		System.out.println(gcd(20, 25));

	}

	public static boolean checkgcd(int[] arr) {
		int gcd = arrayGcd(arr);
		if (gcd == 1)
			return true;
		return false;
	}

	public static int arrayGcd(int[] arr) {
		int hcf = arr[0];
		for (int i = 1; i < arr.length; i++) {
			hcf = gcd(hcf, arr[i]);
		}
		return hcf;
	}

	public static int gcd(int a, int b) {
		int rem = a%b;
		while(rem != 0) {
			a=b;
			b=rem;
			rem = a % b;
		}
		
		return b;
	}

}
