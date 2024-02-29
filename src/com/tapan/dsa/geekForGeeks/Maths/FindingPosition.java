package com.tapan.dsa.geekForGeeks.Maths;

public class FindingPosition {
	public static void main(String[] args) {
		FindingPosition find = new FindingPosition();
		long n = 5;
		System.out.println(find.nthPosition(n));

	}

	public long nthPosition(long n) {
		long p = 1;
		while (p * 2 <= n) {
			p = p * 2;
		}
		return p;
	}

}
