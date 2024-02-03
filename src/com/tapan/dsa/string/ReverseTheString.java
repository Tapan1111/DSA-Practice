package com.tapan.dsa.string;

import java.util.Arrays;

public class ReverseTheString {
	public static void main(String[] args) {
		String str = "hello";
		char[] arr = str.toCharArray();
		// System.out.println(Arrays.toString(arr));
		int s = 0;
		int e = arr.length - 1;

		while (s < e) {
			char temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
