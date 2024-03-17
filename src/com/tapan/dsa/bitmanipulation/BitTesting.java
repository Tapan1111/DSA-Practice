package com.tapan.dsa.bitmanipulation;

public class BitTesting {
	public static void main(String[] args) {
		int n = 168;
		System.out.println(numberofTz(n));
	}

	public static int numberofTz(int n) {
		return (int) (Math.log((n & n - 1) ^ n) / Math.log(2));
	}


}
