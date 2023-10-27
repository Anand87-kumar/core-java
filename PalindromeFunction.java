package com.anand;

import java.util.Scanner;

public class PalindromeFunction {

	//user defined function to check palindrome
	static boolean checkPalindrome(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
			
		}
		if(s.equals(rev)) 
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		PalindromeFunction obj = new PalindromeFunction();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Word");
		String str=sc.nextLine().toUpperCase();

		str =str+ " ";
		String word= "";
		int start=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				word=str.substring(start,i);
				start=i+1;
				if(obj.checkPalindrome(word))
					System.out.println(word);
			}
		}
	}

}
