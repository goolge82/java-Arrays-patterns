package com.Arrays;

public class Duplicates1 {

	public static void main(String[] args) {
		
//		printing duplicates
		
		int[] arr= {1,2,3,4,2,1,5,6,6,3,7,8,9,8,4};
		
		System.out.println("duplicates:- ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
				
			}
		}
		
		System.out.println();
		System.out.println("after removing duplicates:- ");
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			
			for(int j=0; j<i; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			
			if(count==0) {
				System.out.print(arr[i]+" ");
			}
		}	

	}

}
