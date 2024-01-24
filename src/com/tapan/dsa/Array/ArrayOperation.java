package com.tapan.dsa.Array;

import java.util.Arrays;

public class ArrayOperation {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 23, 45, 67, 89 };
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		double[] dobles = new double[5];
		for (int i = 0; i < dobles.length; i++) {
			System.out.print(dobles[i] + " ");
		}
		System.out.println();

		String[] string = new String[5];
		for (int i = 0; i < string.length; i++) {
			System.out.print(string[i] + " ");
		}

		class Person {

		}
		System.out.println();

		Person[] persons = new Person[5];
		for (int i = 0; i < persons.length; i++) {
			System.out.print(persons[i] + " ");
		}
		System.out.println();
		boolean[] bool = new boolean[5];
		Arrays.fill(bool, true);
		System.out.println(Arrays.toString(bool));

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		System.out.println(Arrays.equals(array1, array2));


//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//		System.out.println(sum);

//		for (int marks : arr) {
//			sum = sum + marks;
//		}
//		System.out.println(sum);
	}
}
