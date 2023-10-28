package com.anand;
// remove the duplicate word in particular string 
public class RemoveWord {

	public static void main(String[] args) {
		String str = "CloudTech";
		//System.out.println(str.replaceAll("C",""));
		
		char ch = 'C';
		removeChar(str, ch);
	}
	//inbuild method
	public static void removeChar(String str,char c) {
		int n=str.length();
		String finalStr= "";
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i) !=c) {
				finalStr = finalStr + str.charAt(i);
			}
		}
		System.out.println(finalStr);
	}

}
