package com.tapan.dsa.leetCodeEasy;

public class InsertArray {
	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int j = 0; j < arr.length; j++) {
			arr[j] = j;
			System.out.print(arr[j] + " ");
		}

	}

}
