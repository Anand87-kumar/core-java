package com.anand;

import java.util.Scanner;

//Input code : 10665771011153266797868
//Output code : James Bond
//Input code ; 667685693232837589
public class EncodeToDecode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("CODE: ");
		String code = sc.nextLine();
		
		String t=""; //tempory variable to store ascii/code.
		
		char lastChar=' ';
		
		//BaseCase
		for(int i=0;i<code.length();i++) {
			char c=code.charAt(i);
			t+=c;
			
			//convert to numeric type
			int a = Integer.parseInt(t);
			if((a>=65 && a<=90) || (a>=97 && a<=122) || a==32){
				
				//The first alphabet of each word must be changed to UPPERCASE and the remaining alphabets to LOWERCASE.
				if(lastChar==' ') {
					//Any consecutive sets of code 32 will be taken as only one blank space.
					if((char)a == ' ') {
						//t reset 
						t="";
						continue;
					}
					a = Character.toUpperCase(a);
				}else 
					a = Character.toLowerCase(a);
				
				System.out.print((char)a);
				t="";
				lastChar = (char)a;
			}
		}

	}

}
