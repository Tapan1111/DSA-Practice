package com.tapan.dsa.string;

public class ShuffleArray {
	public static void main(String[] args) {
		ShuffleArray shuffle = new ShuffleArray();
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(shuffle.restoreString(s, indices));
	}

	public String restoreString(String s, int[] indices) {
		char[] charArr = s.toCharArray();
		char[] ans = new char[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			ans[indices[i]] = charArr[i];
		}
		return new String(ans);
	}

}
