package com.tapan.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		System.out.println(permute(arr));

	}

	static List<List<Integer>> ans;
	public static List<List<Integer>> permute(int[] arr) {
		ans = new ArrayList<>();
		permutation(arr, new ArrayList<>());
		return ans;


	}


	public static void permutation(int[] arr, List<Integer> used) {

		if (used.size() == arr.length) {

			ans.add(new ArrayList<>(used));
			return;
		}
		
		for(int i=0; i<arr.length; i++) {
			if (!used.contains(arr[i])) {
				used.add(arr[i]);
				permutation(arr, used);
				used.remove(used.size() - 1);
			}
		}
		
	}

}
