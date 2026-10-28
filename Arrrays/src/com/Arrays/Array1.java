package com.Arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numbers:");
		
		 int[] arr=new int[5];

		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
			
		}
	
		System.out.println("represent array");
		
		for(int i=0; i<arr.length; i++) {
			
		System.out.print(arr[i]+" ");

	}
		sc.close();
	}

}
