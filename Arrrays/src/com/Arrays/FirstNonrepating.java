package com.Arrays;

public class FirstNonrepating {
	
//	Write a Java program to find the first non-repeating element in an array.

	public static void main(String[] args) {
		
		
		int[] arr= {10,11,15,11,13,12,10,12};
		
		for(int i=0; i<arr.length; i++) {
			
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					
					count++;
					
				}
			}
			
			if(count==0) {
				System.out.println("first non-repating:- "+arr[i]);
				break;
			}
		}

	}

}
