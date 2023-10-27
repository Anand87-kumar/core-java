package com.anand;

import java.util.Scanner;

//WAP to input a word and reverse it.
//WAP to input sentence change to uppercase and print the no of words starting & ending with vowels.
public class SplitWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine().toUpperCase();
		
		//extra space is added to split words
		str=str+ " ";
		
		//word variable that means to store word
		String word= "";
		int start = 0;
		for(int i=0;i<str.length();i++) {
			//char at is method
			char ch=str.charAt(i);
			//check the space
			if(ch==' ') {
				word = str.substring(start,i);
				start=i+1;
				System.out.println(word);
			}
		}
	
		
		

	}

}