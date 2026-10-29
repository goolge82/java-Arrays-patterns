package com.Arrays;

import java.util.Scanner;

public class Jaggared1 {

	public static void main(String[] args) {
	
		
		
//		jaggared array with user input
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the rows of array:- ");
		
		int rows=sc.nextInt();
		
		int[][] arr=new int[rows][];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("enter the colums "+ i +":- ");
			
			int col=sc.nextInt();
			
			arr[i]=new int[col];
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.println("enter the elements:- ");
				
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		
		
		System.out.println("jaggared aarray");
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
