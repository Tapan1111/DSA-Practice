package com.tapan.dsa.string;

public class ReverseStringII {
	public static void main(String[] args) {
		ReverseStringII reverse = new ReverseStringII();
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverse.reverseStr(s, k));
	}

	public String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i = i + 2 * k) {
			int start = i;
			int end = Math.min(i + k - 1, s.length() - 1);
			while (start < end) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		return new String(arr);
	}
}
