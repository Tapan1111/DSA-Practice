package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CheckingElementPresent {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 9, 8, 7 };
		Integer[] arr2 = { 4, 1, 2, 10, 15 };
		Integer[] arr3 = { 5, 1, 2, 4, 10 };

		HashSet<Integer> h = new HashSet<Integer>();
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
		List<Integer> list3 = Arrays.asList(arr3);
		h.addAll(list1);
		h.addAll(list2);
		h.addAll(list3);
		System.out.println(h);

	}

}
