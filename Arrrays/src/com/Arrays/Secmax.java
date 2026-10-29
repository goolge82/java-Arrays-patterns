package com.Arrays;

import java.util.Scanner;

public class Secmax {

	public static void main(String[] args) {
		
//	first max, second max, third max	
//{10,10,25,30,25,40,40};
		
         Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		System.out.println("enter the elements");
		
		int[] arr=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i]=sc.nextInt();
		}
		
		int firstmax=arr[0];
		int secmax=arr[0];
		int thirdmax=arr[0];
		
		for(int i=0; i<arr.length; i++) {
				
				if(arr[i]>firstmax) {
					
					firstmax=arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>secmax && firstmax!=arr[i]) {
				
				secmax=arr[i];
		}
	}
		
           for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>thirdmax && firstmax!=arr[i] && secmax!=arr[i]) {
				
				thirdmax=arr[i];
		}
	}
		
		
			System.out.println("first max number:- "+firstmax);
			System.out.println("second max number:-"+secmax);
			System.out.println("second max number:-"+thirdmax);
			
			sc.close();

	}

}
