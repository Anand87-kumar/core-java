package com.anand.set;

import java.util.HashSet;
import java.util.Set;

public class UnorderSet {
	
	//Unorder Set
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(10);
		set.add(5);
		set.add(2);
		//Operation performed in set 1.search,2.remove,3.size,4.isEmpty, 5.add,6. convert array(toArray),7.equals,8.stream
		
		System.out.println(set);
		System.out.println(set.contains(10));
		System.out.println(set.size());
		System.out.println(set.remove(5));
		System.out.println(set);

		//iterate
		for(int i: set) {
			System.out.println(i);
		}
		//another way to iterate the loops.
		set.forEach(p -> System.out.println(p));
		
		//immutable set 
		Set<Integer> set1 = Set.of(2,1,4,7,5);
		System.out.println(set1);
	}

}
