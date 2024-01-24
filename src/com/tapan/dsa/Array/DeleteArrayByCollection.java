package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteArrayByCollection {
	public static void main(String[] args) {
		// Create an array and initialize with String Element;
		String[] array = { "Red", "Blue", "Yellow", "Saffron" };
		System.out.println(Arrays.toString(array));
		// Convert this array in to collection
		List<String> list = new ArrayList(Arrays.asList(array));
		// remove()method in collection to delete element;
		list.remove(2);
		System.out.println(list);
	}
}
