package com.anand;

import java.util.Arrays;

public class FindLargestNumber {

	public static void main(String[] args) {
		int array[]= new int[] {19,32,23,14,50,46};
		int largestNumber;
		
//		Arrays.sort(array);
//		largestNumber=array[array.length-1];
//		System.out.println("Largest element in this array is: "+largestNumber);
		
		int n=array.length;
		largestNumber=array[0];
		for(int i=0;i<n;i++) {
			if(largestNumber<array[i]) {
				largestNumber = array[i];
			}
		}
		System.out.println("Largest element in this array is: "+largestNumber);
	}
}
