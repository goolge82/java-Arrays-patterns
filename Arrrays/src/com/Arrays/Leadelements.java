package com.Arrays;

public class Leadelements {

	public static void main(String[] args) {

//		{7,5,3,4,2,1}
//		output:-{7,5,4,2,1}

		int[] arr = { 7, 5, 3, 4, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i+1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				System.out.println(arr[i] + " ");
			}
		}

	}

}
