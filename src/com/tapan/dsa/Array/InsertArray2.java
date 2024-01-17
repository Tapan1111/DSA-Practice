package com.tapan.dsa.Array;

public class InsertArray2 {
	public static void main(String[] args) {

		InsertArray2 result = new InsertArray2();

		int[] nums = new int[5];
		nums[0] = 11;
		nums[1] = 12;
		nums[2] = 13;
		nums[3] = 4;
		nums[4] = 15;
		result.print(nums);
		System.out.println();

		result.insertAt(nums, 81);
		result.print(nums);
		System.out.println();

		result.insertAtSecond(nums, 1, 66);
		result.print(nums);


	}

	public void insertAt(int[] array, int val) {
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = val;
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void insertAtSecond(int[] arr, int position, int val) {
		for (int i = arr.length - 1; i > position; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position] = val;


	}
}
