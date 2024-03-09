package com.tapan.dsa.maths;

import java.util.Random;

public class GeneratingRandom {
	public static void main(String[] args) {
		System.out.println(rand7());

	}

	public static int rand10() {
		Random rand = new Random();
		int val = rand.nextInt(10);
		return val;
	}

	public static int rand7() {
		int a = rand10();
		while (a > 7) {
			a = rand10();
		}
		return a;
	}

}
