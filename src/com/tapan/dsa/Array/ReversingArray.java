package com.tapan.dsa.Array;

import java.util.Arrays;

public class ReversingArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(arr);

		int[] array = { 12, 54, 89, 33 };
		String[] array2 = { "Tata", "Mahindra", "Landrover", "Tesla" };
		int[][] twodarr = new int[][] { { 1, 2, 3 }, { 3, 8, 66 }, { 45, 32, 87 } };

		Arrays.stream(array2).forEach(System.out::println);
		Arrays.asList(array2).stream().forEach(s -> System.out.println(s));
		System.out.println(Arrays.deepToString(twodarr));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

	}

	public static void reverse(int[] arr) {
		int[] reverseArray = new int[arr.length];
		int index = arr.length;
		for (int i = 0; i < arr.length; i++) {
			reverseArray[index - 1] = arr[i];
			index = index - 1;
		}
		System.out.println("Original Array " + Arrays.toString(arr));
		System.out.println("reverse Array " + Arrays.toString(reverseArray));

	}

}
