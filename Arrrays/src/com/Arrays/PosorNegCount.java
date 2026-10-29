package com.Arrays;

import java.util.Scanner;

public class PosorNegCount {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:- ");
		int n=sc.nextInt();
		
		System.out.println("enter the elements:- ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		
		
		int pos=0;
		int neg=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				pos++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				neg++;
			}
		}
		
		System.out.println("postive:- "+pos);
		System.out.println("negative:- "+neg);
		
		
		sc.close();

	}

}
