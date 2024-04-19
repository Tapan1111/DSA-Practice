package com.tapan.dsa.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PallindromePairs {
	public static void main(String[] args) {
		String[] arr = { "abcd", "dcba", "lls", "s", "sssll" };
		System.out.println(pallindromePairs(arr));

	}

	public static List<List<Integer>> pallindromePairs(String[] words) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(words == null && words.length<2 ) {
			return ans;
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], i);
		}
		System.out.println(map);
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length(); j++) {
				String str1 = words[i].substring(0, j);
				String str2 = words[i].substring(j);
				System.out.println("string 1         " + str1);

				System.out.println("string 2         " + str2);
				System.out.println("------------------------------");
				if (isPalindrome(str1)) {

					String revStr2 = new StringBuilder(str2).reverse().toString();
					System.out.println("reversed string    " + str2);
					if (map.containsKey(revStr2) && map.get(revStr2) != i) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(map.get(revStr2));
						temp.add(i);
						ans.add(temp);

					}

				}
				if (isPalindrome(str2)) {
					String revstr1 = new StringBuilder(str1).reverse().toString();
					if (map.containsKey(revstr1) && map.get(revstr1) != i && str2.length() != 0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(i);
						temp.add(map.get(revstr1));
						ans.add(temp);
					}

				}
				
			}
		}
			
		return ans;
	}

	private static boolean isPalindrome(String word) {

		int left = 0;
		int right = word.length() - 1;
		while (left <= right) {
			if (word.charAt(left++) != word.charAt(right--))
				return false;
		}
		return true;
	}

}
