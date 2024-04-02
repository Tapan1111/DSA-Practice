package com.tapan.dsa.Sorting;

import java.util.Arrays;

public class Sorting2 {
	public static void main(String[] args) {
//		int[] arr1 = { 2, 4, 8, 9, 20, 50 };
//		int[] arr2 = { 1, 5, 9, 13, 15, 18 };
		int[] arr = { 1, 4, 93, 67, 23, 99 };
		int[] res = mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(res));

	}

	public static int[] solve(int[] arr1, int[] arr2) {
		int[] ansArr = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, ansArr, 0, arr1.length);
		System.arraycopy(arr2, 0, ansArr, arr1.length, arr2.length);
		Arrays.sort(ansArr);
		return ansArr;
	}

	// two pointer approach
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] resArray = new int[arr1.length + arr2.length];
		int i = 0;
		int k = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				resArray[k++] = arr1[i++];
			} else {
				resArray[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			resArray[k++] = arr1[i];
			i++;
		}
		while (j < arr2.length) {
			resArray[k++] = arr2[j];
			j++;
		}
		return resArray;
	}

	public static int[] mergeSort(int[] arr, int start, int end) {
		if (start == end) {
			return new int[] { arr[start] };
		}
		int mid = (start + end) / 2;
		int[] firsthalf = mergeSort(arr, start, mid);
		int[] secondhalf = mergeSort(arr, mid + 1, end);
		return merge(firsthalf, secondhalf);

	}

}
