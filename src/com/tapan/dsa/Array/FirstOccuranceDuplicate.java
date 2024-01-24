package com.tapan.dsa.Array;

public class FirstOccuranceDuplicate {
	public static void main(String[] args) {
		Integer[] array = { 2, 2, 31, 1, 45, 2, 5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					return;
				}
			}
		}
	}
}
