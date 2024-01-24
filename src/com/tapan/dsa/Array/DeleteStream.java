package com.tapan.dsa.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteStream {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Original Array" + Arrays.toString(numbers));
		int index = 3;
		System.out.println(IntStream.range(0, numbers.length).filter(i -> i != index).map(i -> numbers[i]));

	}
}
