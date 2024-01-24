package com.tapan.dsa.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student1 {
	private String name;
	private int[] marks;


	public Student1(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}


	public int getNumberofMarks() {

		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
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

	public void addNewMark(int mark) {

	}

}
