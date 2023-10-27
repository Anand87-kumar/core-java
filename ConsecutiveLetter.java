package com.anand;

import java.util.Scanner;

//WAP to i/p a sentence and print those words which contains consecutive letters.

public class ConsecutiveLetter {

	static boolean checkConsecutive(String s) {
		for(int i=0;i<s.length()-1;i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			//to check consecutive character
			if(c1+1 == c2) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Word");
		String str=sc.nextLine().toUpperCase();

		str =str+ " ";
		String word= "";
		int count=0;
		int start=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				word=str.substring(start,i);
				start=i+1;
				if(checkConsecutive(word))
					count++;
			}

	}
		System.out.println("No. of words having consecutive letters: "+count);
}
}