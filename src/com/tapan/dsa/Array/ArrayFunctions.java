package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayFunctions {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5, 2, 6, 9 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(2);
		// System.out.println(list);
		int times = Collections.frequency(list, 2);
		// System.out.println(times);

		String[][] names = { { "Mr.", "Mrs.", "Ms." }, { "Smith", "Jones", "Julia" } };

		// System.out.println(names[0][0] + names[1][0]);
		// System.out.println(names[0][1] + names[1][1]);
		// System.out.println(names[0][2] + names[1][2]);

		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };
		String[] copyTo = new String[7];
		System.arraycopy(copyFrom, 1, copyTo, 0, 7);
		for (String Coffees : copyTo) {
			System.out.println(Coffees + " ");

		}
		System.out.println();

		String[] copyTo2 = Arrays.copyOfRange(copyFrom, 1, 7);
		for (String coffee : copyTo2) {
			System.out.println(coffee + " ");
		}
		System.out.println(Arrays.toString(copyTo));

	}

}
