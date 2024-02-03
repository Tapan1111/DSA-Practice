package com.tapan.dsa.bitmanipulation;

public class CountSetBitsInAnInteger {
	public static void main(String[] args) {
		CountSetBitsInAnInteger bitman = new CountSetBitsInAnInteger();
		System.out.println(bitman.setBits(5));


	}

	public int setBits(int n) {
		int count = 0;
		while (n != 0) {
			int bit = n & 1;
			if (bit == 1) {
				count++;
				n = n >> 1;
			}
		}
		return count;

	}
}
