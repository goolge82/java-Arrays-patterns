package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
//		first array
		System.out.println("enter the first of array size");
		int n1 = sc.nextInt();

		System.out.println("enter the first array elements");

		int[] arr1 = new int[n1];

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();

		}
		
		
//		second array

		System.out.println("enter the second of array size");
		int n2 = sc.nextInt();

		System.out.println("enter the second array elements");

		int[] arr2 = new int[n2];

		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = sc.nextInt();

		}

		System.out.println("First array:");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\nSecond array:");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
//		third array combination of two arrays
		
		
		int[] arr3=new int[n1+n2];
		
		for(int i=0; i<arr1.length; i++) {
			
			arr3[i]=arr1[i];
		}
         for(int i=0; i<arr2.length; i++) {
			
			arr3[n1+i]=arr2[i];
		}
         
         
         System.out.println();
         
         
         System.out.println("Third array:");
         
         
         for(int i=0; i<arr3.length; i++) {
        	 
        	 
         System.out.print(arr3[i]+" ");
         
         
         }
         System.out.println();
         
         
         System.out.println(Arrays.toString(arr3));
		

         sc.close();
	}

}
