package com.tapan.dsa.maths;

public class DayOfTheWeek {
	public static void main(String[] args) {
		DayOfTheWeek day = new DayOfTheWeek();
		System.out.println(day.dayOfTheWeek(4, 3, 2024));

	}

	public String dayOfTheWeek(int day, int month, int year) {
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int nums = 0;
		for (int i = 1971; i < year; i++) {
			if (i % 4 == 0) {
				nums = nums + 366;
			} else {
				nums = nums + 365;
			}
		}
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysOfMonth[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {
			nums = nums + daysOfMonth[i];
		}
		nums = nums + day - 1;
		return week[(nums + 5) % 7];
	}

}
