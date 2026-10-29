package com.Arrays;

import java.util.Scanner;

public class TwoD2 {

	public static void main(String[] args) {
		
		
//		[1,2,3]=6
//		[4,5,6]=15
//		[7,8,9]=24
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sizes of rows:");
		int rows=sc.nextInt();
		System.out.println("enter the sizes of colums:");
		int col=sc.nextInt();
		
		
		int[][] arr=new int[rows][col];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
		
			for(int j=0; j<arr[i].length; j++) {
				
			  sum+=arr[i][j];
			}
			
			System.out.println(sum);
			
		}
		
		sc.close();
		
		
	}

}
