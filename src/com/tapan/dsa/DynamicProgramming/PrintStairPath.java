package com.tapan.dsa.DynamicProgramming;

import java.util.Scanner;

public class PrintStairPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStair(n, " ");
	}

	private static void printStair(int n, String path) {
		if (n < 0) {
			return;
		}
		if (n == 0) {
			System.out.println(path);
			return;
		}
		printStair(n - 1, path + "1");
		printStair(n - 2, path + "2");
		printStair(n - 3, path + "3");

	}
}
