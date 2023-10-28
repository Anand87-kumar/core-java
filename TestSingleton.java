package com.anand;

public class TestSingleton {

	public static void main(String[] args) {
		
		SingletonClass singletonClass1=SingletonClass.getinstance();
		SingletonClass singletonClass2=SingletonClass.getinstance();
		
		if(singletonClass1==singletonClass2) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Both objects are different");
		}

	}

}
