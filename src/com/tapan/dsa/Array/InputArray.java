package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
	}

}
