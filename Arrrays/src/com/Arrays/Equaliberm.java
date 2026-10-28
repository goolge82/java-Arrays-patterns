package com.Arrays;

import java.util.Scanner;

public class Equaliberm {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
//		int[] arr= {1,2,4,2,1};
		
		
		System.out.println("enter the size:- ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter the elements:- ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
			int sum1=0;
			
			for(int j=0; j<i; j++) {
				
				sum+=arr[j];
			}
			
			for(int j=i+1; j<arr.length; j++) {
				sum1+=arr[j];
			}
			
			if(sum==sum1) {
				System.out.println("equalibriam:- "+arr[i]);
			}
			
		}
		
		sc.close();
		

	}

}
