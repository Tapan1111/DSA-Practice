package com.tapan.dsa.bitmanipulation;

public class AttendanceArray {
	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 2 };
		int target = 1;

		System.out.println(solve(arr, target));
	}

	public static boolean solve(int[] arr, int k) {
		int mx = arr[0];
		for (int val : arr) {
			mx = Math.max(mx, val);
		}

		boolean[] tap = new boolean[mx + 1];

		for (int i = 0; i < arr.length; i++) {
			tap[arr[i]] = true;
		}
		// System.out.println(Arrays.toString(tap));

		for (int i = 0; i < arr.length; i++) {
			int need = k ^ arr[i];
			if (need <= mx && tap[need]) {
				return true;
			}

		}


		return false;
	}

}
