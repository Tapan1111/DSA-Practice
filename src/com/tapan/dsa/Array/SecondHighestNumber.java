package com.tapan.dsa.Array;

import java.util.Arrays;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 23, 1 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		int secondLargest = 0;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println(secondLargest);

	}
}
