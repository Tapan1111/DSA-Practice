package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CheckingElementPresent {
	public static void main(String[] args) {

		String l = "111";
		String m = "222";
		int n = Integer.parseInt(l) + Integer.parseInt(m);
		System.out.println(n);

		int a[] = { 1, 2, 3, 9, 8, 7 };
		int b[] = { 4, 1, 2, 10, 15 };
		int c[] = { 5, 1, 2, 4, 10 };

		List<Integer> result = new ArrayList();

		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					if (a[i] == b[j]) {
						result.add(a[i]);
					} else if (a[i] == c[j]) {
						result.add(a[i]);
					}
				}
			}

		}
		HashSet<Integer> set = new HashSet();
		for (int r : result) {
			set.add(r);
		}
		System.out.println(set);

		System.out.println();
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
		System.out.println();

		List<Integer> finalList = new ArrayList<Integer>();
		for (Integer val : h) {
			if ((list1.contains(val) && list2.contains(val)) || (list2.contains(val) && list3.contains(val))
					|| (list1.contains(val) && list3.contains(val))) {
				finalList.add(val);
			}

		}
		System.out.println(finalList);

	}

}
