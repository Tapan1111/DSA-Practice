package com.tapan.dsa.twoPointer;

public class MinimieTheDiffIn3SortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 8, 10 };
		int[] arr2 = { 6, 9, 15 };
		int[] arr3 = { 2, 3, 6, 6 };
		System.out.println(minimizeDiffApproach(arr1, arr2, arr3));

	}

	public static int minimize(int[] arr1, int[] arr2, int[] arr3) {
		int minimize = Integer.MAX_VALUE;
		int a = arr1.length - 1;
		int b = arr2.length - 1;
		int c = arr3.length - 1;
		while (a >= 0 && b >= 0 && c >= 0) {
			int maximus = Math.max(arr1[a], Math.max(arr2[b], arr3[c]));
			int minidum = Math.min(arr1[a], Math.min(arr2[b], arr3[3]));
			int resultant = maximus - minidum;
			minimize = Math.min(resultant, minimize);
			a--;
			b--;
			c--;
		}

		return minimize;
	}

	public static int minimizeUsinNestedLoops(int[] arr1, int[] arr2, int[] arr3) {
		int minimize = Integer.MAX_VALUE;
		for (int i = arr1.length - 1; i >= 0; i--) {
			for (int j = arr2.length - 1; j >= 0; j--) {
				for (int k = arr3.length - 1; k >= 0; k--) {
					int maximus = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
					int minimum = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
					int resultant = maximus - minimum;
					minimize = Math.min(minimize, resultant);
				}
			}
		}

		return minimize;
	}

	public static int minimizeDiffApproach(int[] arr1, int[] arr2, int[] arr3) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = arr3.length - 1;

		int minDiff = Math.max(arr1[i], Math.max(arr2[j], arr3[k])) - Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
		while (i != -1 && j != -1 && k != -1) {

			int currenDiff = Math.max(arr1[i], Math.max(arr2[j], arr3[k]))
					- Math.min(arr1[i], Math.min(arr2[j], arr3[k]));

			if (currenDiff < minDiff) {
				minDiff = currenDiff;
			}
			int maxterm = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
			if (arr1[i] == maxterm) {
				i--;
			} else if (arr2[j] == maxterm) {
				j--;
			} else {
				k--;
			}
		}

		return minDiff;
	}

}
