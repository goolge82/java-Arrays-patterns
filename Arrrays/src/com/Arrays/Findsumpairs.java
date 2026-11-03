package com.Arrays;

public class Findsumpairs {

	public static void main(String[] args) {
//		Write a Java program to find all pairs of elements in an array
//		whose sum is equal to a given target value.
//		Input: 6
//		Output: (2,4) ,(3,3),(1,5)
		
		int[] arr= {1,2,3,4,5,3,4,2,1};
		
		boolean[] arr1=new boolean[arr.length];
		int t=6;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr1[i]) {
				continue;
			}
			
			for(int j=i; j<arr.length; j++) {
				if(arr[i]+arr[j]==t) {
					
					System.out.println("("+arr[i]+","+arr[j]+")");
					arr1[j]=true;
					
				}
			}
		}	

	}

}
