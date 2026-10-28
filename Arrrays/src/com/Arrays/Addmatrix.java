package com.Arrays;

import java.util.Scanner;

public class Addmatrix {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] c=new int[2][2];
		
		
		System.out.println("enter first matrixs:- ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter second matrixs:- ");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("addition matrixs:- ");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
			  System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
//		------------------------------------------------------------------
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		System.out.println("subraction matrixs:- ");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
			  System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
//		--------------------------------------------------------------------------
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		
		System.out.println("multiplication matrixs:- ");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
			  System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
			
//			--------------------------------------------------------------------------
			
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					c[i][j]=a[i][j]/b[i][j];
				}
			}
			
			System.out.println("division matrixs:- ");
			for(int i=0; i<c.length; i++) {
				for(int j=0; j<c[i].length; j++) {
				  System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			
			sc.close();;

	}

}
