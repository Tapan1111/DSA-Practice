package com.tapan.dsa.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student1 {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();


	public Student1(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}


	public int getNumberofMarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (Integer integer : marks) {
			sum = sum + integer;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int maxMarks = Integer.MIN_VALUE;
		for (int obtainMarks : marks) {
			if (obtainMarks > maxMarks) {
				maxMarks = obtainMarks;
			}
		}
		return maxMarks;
	}

	public int getMinimumMarks() {
		int minMarks = Integer.MAX_VALUE;
		for (int obtainedMarks : marks) {
			if (obtainedMarks < minMarks) {
				minMarks = obtainedMarks;
			}
		}
		return minMarks;
	}


	public BigDecimal getAverageMarks() {
		int totalSum = getTotalSumOfMarks();
		int totalNumber = getNumberofMarks();
		
		return new BigDecimal(totalSum).divide(new BigDecimal(totalNumber), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}
	public void addNewMark(int mark) {
		marks.add(mark);

	}

	public void removeMarkAtIndex(int i) {
		marks.remove(i);

	}

	public boolean doesHaveElementHaveGreaterThan(int[] arr, int number) {

		if (arr.length == 0) {
			return false;
		}

		for (int val : arr) {
			if (val > number) {
				return true;
			}
		}
		return false;
	}

	public int findSecondLargest(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;
		for (int value : arr) {
			if (value > largestElement) {
				secondLargestElement = largestElement;
				largestElement = value;
			} else if (value > secondLargestElement && value != largestElement) {
				secondLargestElement = value;
			}
		}

		if (secondLargestElement == Integer.MIN_VALUE) {
			return -1;
		}

		return secondLargestElement;
	}


}
