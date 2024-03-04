package com.tapan.dsa.maths;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n, t;
		t = sc.nextInt();
		BigInteger[] val = new BigInteger[101];
		val[1] = BigInteger.ONE;
		for (int i = 2; i < val.length; i++) {
			val[i] = val[i - 1].multiply(new BigInteger("" + i));

		}
		while (t > 0) {
			n = sc.nextInt();
			System.out.println(val[n]);
			t--;
		}

	}

}
