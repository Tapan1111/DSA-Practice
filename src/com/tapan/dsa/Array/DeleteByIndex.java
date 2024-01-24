package com.tapan.dsa.Array;

import java.util.Arrays;

public class DeleteByIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		DeleteByIndex del = new DeleteByIndex();
		del.deleteIndex(arr, 4);

	}

	public void deleteIndex(int[] arr, int index) {
		int m = arr.length - 1;
		int[] newArray = new int[m];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			newArray[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(newArray));
	}
}
