package com.tapan.dsa.leetCodeEasy;

public class ReverseVowelOfAString {
	public static void main(String[] args) {
		ReverseVowelOfAString reverse = new ReverseVowelOfAString();
		String s = "leetcode";
		System.out.println(reverse.solve(s));
	}

	public String solve(String s) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		int li = 0;
		int ri = n-1;

		while(li < ri) {
			char lch = arr[li];
			char rch = arr[ri];
			if (isVowel(lch) && isVowel(rch)) {
				arr[li] = rch;
				arr[ri] = lch;
				li++;
				ri--;
			} else if (isVowel(lch)) {
				ri--;
			} else {
				li++;
			}

		}
		return new String(arr);
	}

	public boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A') {
			return true;
		} else if (ch == 'e' || ch == 'E') {
			return true;
		} else if (ch == 'i' || ch == 'I') {
			return true;
		} else if (ch == 'o' || ch == 'O') {
			return true;
		} else if (ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}
}
