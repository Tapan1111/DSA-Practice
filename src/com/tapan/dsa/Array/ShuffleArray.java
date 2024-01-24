package com.tapan.dsa.Array;

import java.util.Arrays;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] array = { 2, 5, 1, 3, 4, 7 };
		ShuffleArray shuffleArray = new ShuffleArray();
		shuffleArray.shuffle(array);
		Arrays.toString(array);

	}

	public int[] shuffle(int[] input) {
		int n = input.length;
		int[] ans = new int[n];
		int val1 = 0;
		int val2 = n / 2;
		int index = 0;
		while (val2 < n) {
			ans[index] = input[val1];
			ans[index + 1] = input[val2];
			val1++;
			val2++;
			index = index + 2;
		}
		return ans;


	}
}
