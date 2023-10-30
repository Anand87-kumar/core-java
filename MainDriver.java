package com.anand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {

	public static void main(String[] args) {

		List<Employee1> emp = new ArrayList<Employee1>();
	    Employee1 e1 = new Employee1("Anand",25, 2500);
	    Employee1 e2 = new Employee1("Anand",26, 3500);
	    Employee1 e3 = new Employee1("Anand",27, 4500);
	    Employee1 e4 = new Employee1("Anand",28, 5500);
	    Employee1 e5 = new Employee1("Anand",29, 6500);

	    emp.add(e1);
	    emp.add(e2);
	    emp.add(e3);
	    emp.add(e4);
	    emp.add(e5);

	    System.out.println("OriginalSalary!!1");
	    System.out.println(emp);
	    List<Employee1> incrementedSalary = emp.stream().map(e ->{
	    	if(e.getAge() > 25) {
	    		e.setSalary(e.getSalary()*1.10);
	    	}
	    	return e;
	    }).collect(Collectors.toList());
	    System.out.println("incrementedSalary");
	    System.out.println(incrementedSalary);
	}

}
