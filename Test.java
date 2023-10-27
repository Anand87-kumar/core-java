package com.anand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(102,"Anand","Engineer", 01));
		emplist.add(new Employee(103,"Sudhir","BSC", 02));
		emplist.add(new Employee(104,"Ankit","manager", 03));
		emplist.add(new Employee(105,"Anand","Associate", 04));
		
		//count Employee name stream API java 8 features
		Map<String,Long> nameCount=emplist.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(nameCount);

		// Loop
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(Employee e:emplist) {
			if(!map.containsKey(e.getName())) {
				map.put(e.getName(), 1);
			}else {
				map.put(e.getName(), map.get(e.getName())+1);
			}
		}
		System.out.println(map);
		}
	}


