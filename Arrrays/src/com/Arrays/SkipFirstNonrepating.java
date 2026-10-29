package com.Arrays;

public class SkipFirstNonrepating {

	public static void main(String[] args) {
		
		
//		Write a Java program to find the first non-repeating element in an array.

		
		int[] arr= {10,11,15,11,13,12,10,12};
		
		boolean[] arr1= new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++) {	
			
			if(arr1[i]) {
				continue;
			}
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					arr1[j]=true;
				}
				
			}
			
			if(count==0) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
