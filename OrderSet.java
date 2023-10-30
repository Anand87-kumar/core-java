package com.anand.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderSet {

	public static void main(String[] args) {
		
		Set<Integer> orderset= new LinkedHashSet<Integer>();

		orderset.add(2);
		orderset.add(10);
		orderset.add(4);
		orderset.add(6);
		orderset.add(0);

		System.out.println(orderset);
		System.out.println(orderset.size());
	}

}
