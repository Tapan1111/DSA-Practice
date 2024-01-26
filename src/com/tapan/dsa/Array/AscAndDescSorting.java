package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.Collections;

public class AscAndDescSorting {
	public static void main(String[] args) {
		String[] str = { "a", "z", "k", "d" };

		System.out.println("As Inserted");
		for (String val : str) {
			System.out.println(val);
		}

		Arrays.sort(str);
		System.out.println("After Sorted");
		for (String val : str) {
			System.out.println(val);
		}

		Arrays.sort(str, Collections.reverseOrder());
		System.out.println("After Sorted In Descending Order	");
		for (String val : str) {
			System.out.println(val);
		}
	}
}
