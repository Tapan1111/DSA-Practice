package com.tapan.dsa.hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindPairswhoseSumExistsInArray {
	public static void main(String[] args) {
		int arr[] = {2, 8, 7, 1, 5};
		System.out.println(solve(arr));

	}

	public static List<List<Integer>> solve(int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num: arr) {
			set.add(num);
		}
		System.out.println(set);

		for (int i = 0; i < arr.length; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = i + 1; j < arr.length; j++) {

        		int sum = arr[i]+arr[j];
        		if(set.contains(sum)) {
					temp.add(i);
					temp.add(j);
					ans.add(temp);
        		}
        	}

        }
		return ans;
    }
}
