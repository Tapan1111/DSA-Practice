package com.tapan.dsa.Array;

public class StudentArray {

	private String[] arr;

	StudentArray(String[] arr) {
		this.arr = arr;
	}

	public StudentArray(Object arr2) {

	}

	public void getTheLongest() {
		int maxlength = Integer.MIN_VALUE;
		for (String size : arr) {
			if (size.length() > maxlength) {
				maxlength = size.length();
			}
		}
	}

}
