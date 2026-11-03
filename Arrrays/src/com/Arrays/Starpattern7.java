package com.Arrays;

import java.util.Scanner;



//1charan 
//2charan 2charan 
//3charan 3charan 3charan 
//4charan 4charan 4charan 4charan 
//5charan 5charan 5charan 5charan 5charan 
//5charan 5charan 5charan 5charan 5charan 
//4charan 4charan 4charan 4charan 
//3charan 3charan 3charan 
//2charan 2charan 
//1charan 



public class Starpattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(i +"charan"+" " );
			}

			System.out.println();
		}

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(i  +"charan"+" ");
			}

			System.out.println();
		}
		
		sc.close();
	}

}
