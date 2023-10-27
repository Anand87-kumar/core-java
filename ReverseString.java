package com.anand;

public class ReverseString {

	public static void main(String[] args) {
		String str = "I am Anand Kuamr";
		for(int i=str.length()-1;i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
