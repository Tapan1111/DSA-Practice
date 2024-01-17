package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strAr2 = { "flower", "fluw", " flight" };
//		List<String> str = new ArrayList<String>();
//		str.add("flower");
//		str.add("flow");
//		str.add("flight");
//		System.out.println(str);
//		String[] newstr = new String[str];
		longestCommonPrefix(strAr2);
//		System.out.println(longestCommonPrefix(str1.substring(0, index)));

	}

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		String str1 = strs[0];
		String str2 = strs[strs.length - 1];
		int index = 0;

		int l = str1.length();
		while (index < str1.length()) {
			char m = str1.charAt(index);
			char n = str2.charAt(index);
			if (str1.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}
			System.out.println(str1.substring(0, index));
		}

		return index == 0 ? " " : str1.substring(0, index);


	}

}
