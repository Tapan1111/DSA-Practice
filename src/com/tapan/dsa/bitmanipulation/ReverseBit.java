package com.tapan.dsa.bitmanipulation;

public class ReverseBit {
	public static void main(String[] args) {
		String m = "10";
		System.out.println(solve(m));
	}

	public static int solve(String n) {
		int m = Integer.parseInt(n);
		boolean flag = false;
		for (int i = 31; i >= 0; i--) {
			int mask = (1 << i);
			if (flag) {
				if ((m & mask) != 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			} else {
				if ((m & mask) != 0) {
					flag = true;
					System.out.print(1);
				}
			}
		}
		System.out.println();
		return m;

	}

}
