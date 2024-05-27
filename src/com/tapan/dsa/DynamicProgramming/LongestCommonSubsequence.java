package com.tapan.dsa.DynamicProgramming;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String s = "AGGTAB";
		String t = "GXTXAYB";
		System.out.println(solve(s, t));

	}

	public static int solve(String s1, String s2) {
		return helper(s1, s2, 0, 0);
	}

	private static int helper(String s1, String s2, int i, int j) {
		if (i >= s1.length() || j >= s2.length()) {
			return 0;
		}
		if (s1.charAt(i) == s2.charAt(j)) {
			return 1 + helper(s1, s2, i + 1, j + 1);
		}
		int a = helper(s1, s2, i + 1, j);
		int b = helper(s1, s2, i, j + 1);

		return Math.max(a, b);
	}

}
