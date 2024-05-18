package com.tapan.dsa.LinkedList;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedListsComparable {

	public static class Pair implements Comparable<Pair> {
		int li;
		int di;
		int val;

		public Pair(int li, int di, int val) {
			this.li = li;
			this.di = di;
			this.val = val;
		}

		@Override
		public int compareTo(Pair o) {
			return this.val - o.val;
		}
	}
	public static ArrayList<Integer> mergeksortedList(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> rv = new ArrayList<Integer>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < lists.size(); i++) {
			Pair p = new Pair(i, 0, lists.get(i).get(0));
			pq.add(p);
		}
		while (pq.size() > 0) {
			Pair p = pq.remove();
			rv.add(p.val);
			p.di++;
			if (p.di < lists.get(p.li).size()) {
				p.val = lists.get(p.li).get(p.di);
				pq.add(p);
			}

		}
		return rv;
	}

}
