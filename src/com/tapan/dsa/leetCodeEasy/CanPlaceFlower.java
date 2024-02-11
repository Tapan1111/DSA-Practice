package com.tapan.dsa.leetCodeEasy;

public class CanPlaceFlower {
	public static void main(String[] args) {
		CanPlaceFlower flower = new CanPlaceFlower();
		int[] arr = { 0 };
		System.out.println(flower.canPlace(arr, 1));

	}

	public boolean canPlace(int[] arr, int n) {
		int max = 0;
		int f = -1;
		int l = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			} else if (f == -1) {
				f = i;
				l = 1;
			} else {
				l = i;
			}
		}

		if (f == -1) {
			max = (arr.length + 1) / 2;
		} else {
			int leftZeroCount = f;
			int rightZeroCount = (arr.length - 1) - l;

			max = leftZeroCount / 2;
			max += rightZeroCount / 2;

			int count = 0;
			for (int i = f + 1; i <= l - 1; i++) {

				if (arr[i] == 0) {
					count++;
				} else {
					max = max + (count - 1) / 2;
					count = 0;
				}
			}
			max = max + (count - 1) / 2;
		}
		return n <= max;
	}
}
