package com.Arrays;

public class Jaggarednames {

	public static void main(String[] args) {
		
		
		String[][] arr=new String[3][];
		
		arr[0]=new String[3];
		arr[1]=new String[2];
		arr[2]=new String[1];
		
		
		arr[0][0]="java";
		arr[0][1]="sql";
		arr[0][2]="plsql";
		
		arr[1][0]="html";
		arr[1][1]="css";
		
		arr[2][0]="javascript";
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		

	}

}
