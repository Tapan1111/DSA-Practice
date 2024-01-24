package com.tapan.dsa.Array;

public class StringArray {
	String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	public static void main(String[] args) {
		StringArray str = new StringArray();
		str.getTheDayWithLongest();
		str.printReverse();

	}

	public void getTheDayWithLongest() {
		String dayWithMostCharacter = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacter.length()) {
				dayWithMostCharacter = day;
			}

		}
		System.out.println(dayWithMostCharacter);
		System.out.println();
	}


	public void printReverse() {
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
