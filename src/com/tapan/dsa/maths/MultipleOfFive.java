package com.tapan.dsa.maths;

import java.util.Arrays;

public class MultipleOfFive {
	public static void main(String[] args) {
		MultipleOfFive multiple = new MultipleOfFive();
		int[] res = multiple.solve(15);
		System.out.println(Arrays.toString(res));

	}

	public int[] solve(int n) {
		int[] ans = new int[n / 5];
		int index = 0;
		for (int i = 5; i <= n; i++) {
			if (i % 5 == 0) {
				ans[index] = i;
				index++;
			}
		}
		return ans;
	}
}
