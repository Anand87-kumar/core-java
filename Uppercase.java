package com.anand;

import java.util.Scanner;

//WAP to input a word and reverse it.
//WAP to input sentence change to uppercase and print the no of words starting & ending with vowels.
public class Uppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine().toUpperCase();
		
		//extra space is added to split words
		str=str+ " ";
		
		//word variable that means to store word
		String word= "";
		int start = 0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			//char at is method
			char ch=str.charAt(i);
			//check the space
			if(ch==' ') {
				word = str.substring(start,i);
				start=i+1;
				
				char ch1 = word.charAt(0); //this is starting character
				char ch2 = word.charAt(word.length()-1); // this is ending character
				if(ch1=='A' || ch1=='E'|| ch1=='I' || ch1=='O' || ch1=='U')
					if(ch2=='A' || ch2=='E'|| ch2=='I' || ch2=='O' || ch2=='U')
						count++;
			}
		}
	
		System.out.println("No. of words starting & ending  with vowel: "+count);

		

	}

}
