package com.Arrays;

import java.util.Scanner;

public class TwoD1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the row size:- ");
		int r = sc.nextInt();
		System.out.println("enter the colum size:- ");
		int c = sc.nextInt();

		System.out.println("enter the elements");

		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
