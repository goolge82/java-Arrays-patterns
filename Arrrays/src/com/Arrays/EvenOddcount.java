package com.Arrays;

import java.util.Scanner;

public class EvenOddcount {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:- ");
		int n=sc.nextInt();
		
		System.out.println("enter the elements:- ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		
		int even=0;
		int odd=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				odd++;
			}
		}
		
		System.out.println("even:- "+even);
		System.out.println("odd:- "+odd);
		
		sc.close();
	}

}
