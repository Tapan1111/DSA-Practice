package com.tapan.dsa.leetCodeEasy;

public class MergeStringAlternatively {
	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeAlternatively(word1, word2));

	}

	public static String mergeAlternatively(String word1, String word2) {
		int i = 0;
		int j = 0;
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		while (i < word1.length() && j < word2.length()) {
			if (flag) {
				sb.append(word1.charAt(i));
				i++;
			} else {
				sb.append(word2.charAt(j));
				j++;
			}
		}
		while (i < word1.length()) {
			sb.append(word1.charAt(i));
			i++;
		}
		while (j < word2.length()) {
			sb.append(word2.charAt(j));
			j++;
		}
		return sb.toString();
	}

}
