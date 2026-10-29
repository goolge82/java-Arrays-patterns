package com.Arrays;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array size");
		
		int n=sc.nextInt();
		
		
		System.out.println("entre the numbers");
		int arr[]=new int[n];
		
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
			sum+=arr[i];
			
		}
		
		System.out.println(sum);
		

		
		sc.close();
	}

}
