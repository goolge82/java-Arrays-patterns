package com.Arrays;

import java.util.Scanner;

public class Customerarray {

	public static void main(String[] args) {
		
		
//		int[] arr= {1,2,3,4,5,6};
//		
//		int high=arr[0];
//		int low=arr[0];
//		int total=0;
//		
//	
////		product prices highest/lowest
//		for(int i=0; i<arr.length; i++) {
//			
//			total+=arr[i];
//			
////			lowest
//			if(arr[i]<low) {
//				low=arr[i];
//			}
////			highest
//			else if(arr[i]>high){
//			high=arr[i];
//			}
//			
//			if(arr[i]>3) {
//				System.out.println("product cost is more than 3:- "+arr[i]);
//			}
//			
//		}
//		
////		total amount
////		for(int i=0; i<arr.length; i++) {
////			total+=arr[i];
////		}
//		
////		displaying the product price list more than 3
//		
////		for(int i=0; i<arr.length; i++) {
////		if(arr[i]>3) {
////			System.out.println("product cost is more than 3:- "+arr[i]);
////		}
////		}
//		
//		System.out.println("total bill amount is:-"+total);
//		System.out.println("highest-price product is:- "+high);
//		System.out.println("lowest-price product is:- "+low);
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the size of array:- ");
		int n=sc.nextInt();
		
		
		
		String[] product=new String[n];
		int[] arr=new int[n];
		
		
		for(int i=0; i<n; i++) {
			
			System.out.println("enter the products:- ");
			sc.next();
			product[i]=sc.nextLine();
			System.out.println("enter the prices:- ");
			arr[i]=sc.nextInt();
		}
		
		
//		customer price range
		System.out.println("enter the product cost:- ");
		int price=sc.nextInt();
		
		int total=0;
		int high=arr[0];
		int low=arr[0];
		
		
		 System.out.println("\n========== SHOPPING BILL ==========");

	        System.out.printf("%-15s %10s%n", "Product", "Price");
	        System.out.println("-----------------------------------");
	        
		for(int i=0; i<arr.length; i++) {
			
//			total array sum
			total+=arr[i];
			
//			highest/lowest number in an array
			
			if(arr[i]<low) {
				low=arr[i];
			}
			else if(arr[i]>high) {
				high=arr[i];
			}
			
			 if(arr[i] > price) {

	                System.out.printf("%-15s %10d%n",
	                        product[i], arr[i]);
	            }
	        }

	        System.out.println("-----------------------------------");
		
		System.out.println("total bill amount is:-"+total);
		System.out.println("highest-price product is:- "+high);
		System.out.println("lowest-price product is:- "+low);
		
		sc.close();
		
	}

}
