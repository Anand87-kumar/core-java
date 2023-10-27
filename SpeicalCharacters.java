package com.anand;

public class SpeicalCharacters {

	public static void main(String[] args) {
		String str= "CloudTech#@!";
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && (!Character.isWhitespace(str.charAt(i))) && (!Character.isLetter(str.charAt(i)))) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There are special character in string");
			
		}else {
			System.out.println("Special charcater found: "+count);
		}
	}

}
