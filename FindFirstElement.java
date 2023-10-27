package com.anand;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("apple","banana","grapes","blueberry");
		Optional<String> result=names.stream().filter(name->name.startsWith("b")).findFirst();
		System.out.println(result);

	}

}
