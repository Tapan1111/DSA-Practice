package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlippingAnImage {
	public static void main(String[] args) {
		List<List<Integer>> image = new ArrayList<List<Integer>>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				temp.add(sc.nextInt());
			}
			image.add(temp);
		}
		System.out.println(image);

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int m = image.size();
		System.out.println(m);
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> temperory = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				temperory.add(2 - image.get(i).get(n - j - 1));
			}
			ans.add(temperory);
		}
		System.out.println(ans);
	}

}
