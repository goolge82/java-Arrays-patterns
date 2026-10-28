package com.Arrays;

import java.util.Scanner;

public class FactorArray {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:- ");
		int n=sc.nextInt();
		
		System.out.println("enter the elements:- ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		
		for(int i=0; i<arr.length; i++) {
			
			isfact(arr[i]);
		}
		
		sc.close();

	}
	
	static void isfact(int n) {
		
		
		  System.out.println("Factors of " + n + " are:");
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
	}

}
