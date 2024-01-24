package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		for (int val : arr) {
			sum = sum + val;

		}
		System.out.println(sum);
	}
}
