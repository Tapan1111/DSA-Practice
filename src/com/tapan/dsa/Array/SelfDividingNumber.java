package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
	public static void main(String[] args) {
		SelfDividingNumber number = new SelfDividingNumber();
		int n1 = 1;
		int n2 = 22;
		System.out.println(number.selfDividingNumbers(n1, n2));
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (iSSelfDividing(i)) {
				ans.add(i);
			}
		}
		return ans;
	}

	public boolean iSSelfDividing(int n) {
		int ogNum = n;
		while (n > 0) {
			int digit = n % 10;
			if (digit == 0 || ogNum % digit != 0) {
				return false;
			}
			n = n / 10;
		}
		return true;
	}

}
