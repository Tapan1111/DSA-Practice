package com.tapan.dsa.Array;

import java.util.Arrays;

public class ConcateTheArray {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1 };
		ConcateTheArray concat = new ConcateTheArray();
		int[] result = concat.solve(input);
		System.out.println(Arrays.toString(result));
//		int[] ans = new int[2 * input.length];
//		for (int i = 0; i < input.length; i++) {
//			ans[i + input.length] = input[i];
//			ans[i] = ans[i + input.length];
//		}
//		System.out.println(Arrays.toString(ans));


	}

	public int[] solve(int[] input) {
		int[] ans = new int[2 * input.length];
		for (int i = 0; i < input.length; i++) {
			ans[i + input.length] = input[i];
			ans[i] = ans[i + input.length];
		}
		return ans;

	}

}
