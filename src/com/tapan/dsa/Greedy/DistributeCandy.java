package com.tapan.dsa.Greedy;

public class DistributeCandy {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3 };
		System.out.println(distributeCandies(arr));
	}

	public static int distributeCandies(int[] candyType) {
		int n = candyType.length;
		int ace = n / 2;
		int diffCandy = 0;
		int maxNoOfCandy = 0;
		for (int i = 1; i < n; i++) {
			if (candyType[i] != candyType[i - 1]) {
				diffCandy++;
				maxNoOfCandy = Math.max(maxNoOfCandy, diffCandy);
			}
		}
		return Math.max(ace, maxNoOfCandy);

	}

}
