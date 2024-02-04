package com.tapan.dsa.bitmanipulation;

import java.util.Scanner;

public class LearningBitMask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();

		// making mask for n
		int onmask = (1 << i);
		int ofmask = (1 << j);
		int tmask = ~(1 << k);
		int cmask = (1 << m);

		// now implementing mask
		System.out.println(n | onmask);
		System.out.println(n & ofmask);
		System.out.println(n ^ tmask);
		System.out.println((n & cmask) == 0 ? false : true);
	}

}
