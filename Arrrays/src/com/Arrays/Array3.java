package com.Arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter the names");
		
		String arr[]=new String[n];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=sc.nextLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]+" ");
		}
		
		sc.close();
		

	}

}
