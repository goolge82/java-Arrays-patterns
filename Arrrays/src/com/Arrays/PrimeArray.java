package com.Arrays;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
//		System.out.println("enter the array size:- ");
//		int n=sc.nextInt();
//		
//		System.out.println("enter the elements:- ");
//		int[] arr=new int[n];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
		
			
//		}
		
		int[] n= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Prime numbers:- ");
		for(int i=0; i<n.length; i++) {
			if(isprime(n[i])) {
				
				System.out.println(n[i]+" ");
				
			}
		}
		
		sc.close();

	}
	
	static boolean isprime(int n) {
		
		
		boolean status=true;
		
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2; i<n; i++) {
			
			if(n%i==0) {
				status=false;
				break;
			}
		}
		
		
		return status;
		
	}

}
