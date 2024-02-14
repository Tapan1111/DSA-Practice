package com.tapan.dsa.leetCodeEasy;

public class MaximumNoOfVowelInASubString {
	public static void main(String[] args) {
		MaximumNoOfVowelInASubString vowel = new MaximumNoOfVowelInASubString();
		String s = "abciiidef";
		int k = 3;
		vowel.solve(s, k);
		System.out.println(vowel.solve(s, k));
	}

	public int solve(String s, int k) {
		int count = 0;
		int ans = 0;
		for(int i=0; i<k; i++) {
			char c = s.charAt(i);
			if (isVowel(c)) {
				count++;
			}
		}
		ans = count;
		for (int i = k; i < s.length(); i++) {
			char rch = s.charAt(i);
			char lch = s.charAt(i - k);
			// System.out.println(rch);
			if (isVowel(rch)) {
				count++;
			}
			if (isVowel(lch)) {
				count--;
			}
			ans = Math.max(ans, count);
		}


		return ans;
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
