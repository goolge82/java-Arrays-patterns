package com.Arrays;

public class Trick1 {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50};
		
		System.out.println("original array:- ");
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<a.length-1; i++) {
			a[i]=a[i]+a[i+1];
			i+=2;
		}
		
		System.out.println();
		System.out.println("after trick complete:- ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
//		iteration 1
//		a={10,20,30,40,50}
//		   0  1
//		a.length-1=5-1=4
//		i=0; 0<4--true,
//		a[0]=a[0]+a[0+1]
//		a[0]=10+20;
//		a[0]=30
//		then increment 0+1=1
//		again increment 1+1=2
		
//		//		iteration 1
//		a={10,20,30,40,50}
//		          0 1
//		a.length-1=5-1=4
//		i=2; 2<4--true,
//		a[2]=a[2]+a[2+1]
//		a[2]=30+40;
//		a[2]=70
//		then increment 2+1=3
//		again increment 3+1=4
		
//		iteration3
//		i=4; 4<4; false
//		so loop end here

	}
	
//	now a[i] reprensenting right at that time it take "a" in that it print
//	30,20,70,40,50
	

}
