package com.tapan.dsa.Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 3, 4, 2, 1, 4 };
		Set<Integer> nonDuplicates = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();

		for (Integer val : array) {
			if (!nonDuplicates.contains(val)) {
				nonDuplicates.add(val);
			}else {
				duplicates.add(val);
			}
			
		}
		System.out.println(duplicates);
	}
}
