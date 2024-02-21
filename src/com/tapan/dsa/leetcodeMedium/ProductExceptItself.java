package com.tapan.dsa.leetcodeMedium;

import java.util.Arrays;

public class ProductExceptItself {
	public static void main(String[] args) {
		ProductExceptItself product = new ProductExceptItself();
		int[] arr = { 1, 2, 3, 4 };
		int[] res = product.solve(arr);
		System.out.println(Arrays.toString(res));

	}

	public int[] solve(int[] arr) {
		int product = 1;
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = product / arr[i];
		}
		return arr;
	}

}
