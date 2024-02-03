package com.tapan.dsa.bitmanipulation;

public class CountSetBitsInAnInteger {
	public static void main(String[] args) {
		CountSetBitsInAnInteger bitman = new CountSetBitsInAnInteger();
		System.out.println(bitman.setBits(5));


	}
	
//	int arr = new int [26]; for {int i=0; i< givenArray.length(); i++){ arr[givenArray[i]++} ; for (int i : givenArray) if arr[k-i]>1 return true; } return false

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
