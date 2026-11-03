package com.Arrays;

import java.util.Scanner;


//reversed left half triangle
public class Starpattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");

		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
