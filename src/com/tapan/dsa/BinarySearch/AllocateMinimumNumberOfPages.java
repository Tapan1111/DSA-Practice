package com.tapan.dsa.BinarySearch;

public class AllocateMinimumNumberOfPages {
	public static void main(String[] args) {
		int[] arr = { 15, 10, 19, 10, 5, 18, 7 };
		int students = 5;
		System.out.println(minPages(arr, students));

	}

	public static int minPages(int[] arr, int students) {
		if (arr.length < students) {
			return -1;
		}
		int sum = 0;
		int max = 0;
		for (int val : arr) {
			sum = sum + val;
			max = Math.max(max, val);
		}
		int s = max;
		int e = sum;
		int ans = 0;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (isPossible(arr, mid, students) == true) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int mid, int students) {
		 int noOfStudents = 1;
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum > mid) {
					noOfStudents++;
					sum = arr[i];
				}
			}
			return noOfStudents <= students;
	}

}
