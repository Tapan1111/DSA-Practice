package com.tapan.dsa.string;

public class CheckRotation {
	public static void main(String[] args) {
		System.out.println(isRotated("abcde", "eabcd"));

	}

	public static boolean isRotated(String str, String isRotated) {

		if (str == null || isRotated == null) {
			return false;
		} else if (str.length() != isRotated.length()) {
			return false;
		} else {
			String concatenatedString = str + str;
			return concatenatedString.contains(isRotated);
		}
	}
}
