package com.tapan.dsa.bitmanipulation;

public class PreProcessingXor {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int xor = 0;
		int x = 0;
		arr[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] ^ i;
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
	}

}
