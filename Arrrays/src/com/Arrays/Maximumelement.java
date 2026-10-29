package com.Arrays;

import java.util.Scanner;

public class Maximumelement {

	public static void main(String[] args) {
		
//		[1,2,3]
//		[4,5,6]
//		[7,8,9]
//	col max=	 7 8 9
		
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
			
			int max=arr[0][0];
			for(int j=1; j<arr[i].length; j++) {
				
				if(arr[j][i]>max) {
					max=arr[j][i];
				}
				
			}
			System.out.println(max+" ");
		}
		
		sc.close();
	}

	
}
