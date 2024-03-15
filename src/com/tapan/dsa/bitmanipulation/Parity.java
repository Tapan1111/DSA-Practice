package com.tapan.dsa.bitmanipulation;

public class Parity {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solve(n));
		
	}

	public static boolean solve(int n) {
		return (n & 1) == 0;
	}

}
