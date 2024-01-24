package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] normalArray = new int[n];
		int[] reverseArray = new int[n];
		int index = normalArray.length;

		for (int i = 0; i < normalArray.length; i++) {
			normalArray[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(normalArray));
		System.out.println();

		for (int i = 0; i < normalArray.length; i++) {
			reverseArray[index - 1] = normalArray[i];
			index--;
		}
		System.out.println(Arrays.toString(reverseArray));
		for (int j = normalArray.length - 1; j >= 0; j--) {
			System.out.println(normalArray[j]);
		}

	}
}
