package com.Arrays;

public class Array2 {

public static void main(String[] args) {
		
		
//		step1:declaration
		
//		int price[];
		
	
	
	   Integer price[];
//		step2:Creation
		
		price=new Integer[5];
		
//		step3:intialization
		
		
		price[0]=Integer.valueOf(100);
		price[1]=Integer.valueOf(200);
		price[2]=Integer.valueOf(300);
		price[3]=Integer.valueOf(400);
		price[4]=Integer.valueOf(500);

		
		
		
//		step4:representation the array
		for(int i=0; i<price.length; i++) {
			
			System.out.println(price[i]);
		}

	}

}
