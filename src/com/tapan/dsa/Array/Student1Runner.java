package com.tapan.dsa.Array;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student1Runner {
	public static void main(String[] args) {
		Student1 student = new Student1("Tapan", 23, 45, 67, 56, 90);
		int[] array = { 1, 45, 3, 7, 9, 4 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int seconlargestNumber = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > seconlargestNumber) {
				seconlargestNumber = array[i];
			}
		}
		System.out.println(seconlargestNumber);

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

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(2);
		System.out.println(student);

		System.out.println(student.doesHaveElementHaveGreaterThan(array, 4));
		System.out.println(student.findSecondLargest(array));

	}

}
