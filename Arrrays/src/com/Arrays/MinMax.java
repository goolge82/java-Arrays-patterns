package com.Arrays;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		System.out.println("enter the elements");
		
		int[] arr=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("minimum number in give array:-"+ min);
		System.out.println("maximum number in give array:-"+ max);
		
		
		
		sc.close();

	}

}
