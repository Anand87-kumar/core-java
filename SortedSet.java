package com.anand.treeset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {

		//NavigableSet<Integer> sortedSet = new TreeSet<Integer>);
		NavigableSet<Integer> sortedSet = new TreeSet<Integer>(Comparator.reverseOrder());
		sortedSet.add(21);
		sortedSet.add(100);
		sortedSet.add(1);
		sortedSet.add(31);

		System.out.println(sortedSet);
		System.out.println(sortedSet.headSet(31,true));
		System.out.println(sortedSet.tailSet(31,false));
		System.out.println(sortedSet.descendingSet());
	}

}
