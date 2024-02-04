package com.tapan.dsa.Array;

public class FindThePair {
	public static void main(String[] args) {
		FindThePair findThePair = new FindThePair();

		int[] arr = { 5, 3, 2, 7 };
		int target = 12;
		System.out.println(findThePair.pair(arr, target));





	}

	// O(N^2)
	public boolean pair(int[] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					return true;
				}
			}
		}
		
		// O(N)
		int mx = -1;
		for (int i = 0; i < arr.length; i++) {
			mx = Math.max(mx, arr[i]);
		}
		boolean[] atndArray = new boolean[mx + 1];
		
		for (int i = 0; i < arr.length - 1; i++) {
			atndArray[arr[i]] = true;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int aj = target ^ arr[i];
			if (aj <= mx && atndArray[aj]) {
				return true;
			}
		}

		return false;
		
		

	}

}
