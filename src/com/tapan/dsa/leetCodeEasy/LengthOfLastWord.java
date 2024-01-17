package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "fly me   to   the moon";
		lengthOfLastWord(s);
//		System.out.println(lengthOfLastWord(Arrays.toString(s)));

	}

	public static int lengthOfLastWord(String s) {
		String[] str = s.split(" ");
		String word = str[str.length - 1];
		System.out.println(word);
		System.out.println(Arrays.toString(str));

		int length = word.length();
		System.out.println(length);
		return length;

	}

}
