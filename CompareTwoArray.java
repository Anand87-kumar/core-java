package com.anand;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {1,2,3,4,5,7};
		if(areEqual(arr1, arr2)) {
			System.out.println("Two arrays are equals");
		}else {
			System.out.println("Two arrays are not equals");
		}

	}

	//Inbuid method
	public static boolean areEqual(int[] arr1,int[] arr2) {
		//n is length of arr1
		int n = arr1.length;
		int m = arr2.length;

		if(n !=m) {
			return false;

		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=00; i<n;i++) {
			if(arr1[i] !=arr2[i])
				return false;
		}
		return true;
	}
}
