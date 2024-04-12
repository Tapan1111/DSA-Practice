package com.tapan.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationPallindrome {
	public static void main(String[] args) {
		String s = "a1b2";
		System.out.println(letterCasePermutation(s));

	}

//	public static List<String> letterCasePermutation(String s) {
//		List<String> ans = new ArrayList<String>();
//		helper(ans, s, 0);
//		return ans;
//	}

	public static String[] letterCasePermutation(String s) {
		List<String> ans = new ArrayList<String>();
		helper(ans, s, 0);
		String[] result = ans.toArray(new String[0]);
		return result;
	}
	private static void helper(List<String> ans, String s, int start) {

		ans.add(s);

		for (int i = start; i < s.length(); i++) {
			char arr[] = s.toCharArray();
			if (Character.isLetter(s.charAt(i))) {
				if (Character.isUpperCase(s.charAt(i))) {
					arr[i] = Character.toLowerCase(s.charAt(i));
					helper(ans, String.valueOf(arr), i + 1);
				} else {
					arr[i] = Character.toUpperCase(s.charAt(i));
					helper(ans, String.valueOf(arr), i + 1);
				}
			}
		}

	}

}
