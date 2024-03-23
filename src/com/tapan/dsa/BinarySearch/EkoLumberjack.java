package com.tapan.dsa.BinarySearch;

public class EkoLumberjack {
	public static void main(String[] args) {
		int[] arr = {20, 15, 10, 17};
		int trees = 7;
		System.out.println(search(arr, trees));
		
	}

	public static int search(int[] arr, int trees) {
		int mx = 0;
		int sum = 0;
		for (int val : arr) {
			sum = sum + val;
			mx = Math.max(mx, val);
		}
		int s = mx;
		int e = sum;
		int ans = Integer.MIN_VALUE;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (isPossible(arr, mid, trees) == true) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}

		return ans == Integer.MIN_VALUE ? -1 : ans;
	}

	private static boolean isPossible(int[] arr, int mid, int trees) {
		int noOfTrees = 0;
		for(int val:arr) {
			if (val > mid) {
				noOfTrees += val - mid;
			}
			if (noOfTrees >= trees) {
				return true;
			}
		}
		return false;
	}

}
