package com.anand;
//Write a Java Program to create a singleton class
//Ans :- Both object are same class and same instance these process known as singleton class.
public class SingletonClass {

	// instance variable cannot access outside of the class.
	//instance variable can access inside of the class.
	private static SingletonClass instance;
	
	private SingletonClass() {
		
	}
	public static SingletonClass getinstance() {
		if(instance==null) {
			synchronized (SingletonClass.class) {
				if(instance==null) {
					instance=new SingletonClass();
				}
			}
		}
		return instance;
	}

}
