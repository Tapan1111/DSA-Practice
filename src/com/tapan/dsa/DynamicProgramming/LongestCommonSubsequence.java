package com.tapan.dsa.DynamicProgramming;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String s = "AGGTAB";
		String t = "GXTXAYB";
		System.out.println(solve(s, t));

	}

	public static int solve(String s, String t) {
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				count++;
				j++;
			}
			i++;
		}
		return count;
	}

//	public static boolean check(char i, char j) {
//		if (i == j) {
//			i++;
//			j++;
//		} else if (i != j) {
//			j++;
//		}
//	}

}
