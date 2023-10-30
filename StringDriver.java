package com.anand;

public class StringDriver {

	public static void main(String[] args) {
		
		String str1 = "Abc"; // create literal 
		String str2 = "Abc";
		String str3 = new String("abc"); //create heap 
		
//		System.out.println(str1==str2);
//		System.out.println(str1==str3);
//		System.out.println(str1.equals(str3)); // check the contain of the string
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));


	}

}
