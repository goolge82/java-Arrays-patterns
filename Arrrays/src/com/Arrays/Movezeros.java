package com.Arrays;

public class Movezeros {

	public static void main(String[] args) {
//		Write a Java program tomove all zeros to the end of an 
//		array without changing the order of non-zero elements.
		
		int[] arr= {0,0,0,3,8,5};
		int k=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0) {
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
					
				}
			}
			 
			System.out.print(arr[i]+" ");
		}

	}

}
