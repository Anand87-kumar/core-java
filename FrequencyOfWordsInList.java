package com.anand;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordsInList {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("AA","BB","AA","DD","CC","DD");
		Map<String,Long> wordsCountMap=names.stream().filter(word->Collections.frequency(names, word)>1)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println("Words having count >=2");
		System.out.println(wordsCountMap);
	}

}
