package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumTwoArray {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
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

		
		
//		representing the arrays
		System.out.println("First array:");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\nSecond array:");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		

		System.out.println();
		int[] arr3=new int[n2];
		
		
		for(int i=0; i<arr2.length; i++) {
			
			if(i<arr1.length) {
			arr3[i] = arr1[i] + arr2[i];
			}
			else {
				arr3[i]=arr2[i];
			}
		}

        System.out.print(Arrays.toString(arr3));


        
        sc.close();
	}

}
