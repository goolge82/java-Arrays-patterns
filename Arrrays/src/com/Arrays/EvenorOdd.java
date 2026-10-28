package com.Arrays;

public class EvenorOdd {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Even numbers:- ");

		for (int i = 0; i < n.length; i++) {

			if (n[i] % 2 == 0) {
				System.out.print(n[i] + " ");
			}
		}

		System.out.println();
		System.out.println("odd numbers:- ");
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 != 0) {
				System.out.print(n[i] + " ");
			}
		}
	}

}
