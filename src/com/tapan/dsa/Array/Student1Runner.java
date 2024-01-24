package com.tapan.dsa.Array;

import java.math.BigDecimal;

public class Student1Runner {
	public static void main(String[] args) {
		Student1 student = new Student1("Tapan", 23, 45, 67, 56, 90);
		int number = student.getNumberofMarks();
		System.out.println("Number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);

		int maximunMarks = student.getMaximumMarks();
		System.out.println("maximunMarks of marks : " + maximunMarks);

		int minimumMarks = student.getMinimumMarks();
		System.out.println("minimumMarks of marks : " + minimumMarks);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks : " + average);

		student.addNewMark(35);

	}

}
