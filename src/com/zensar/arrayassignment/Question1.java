package com.zensar.arrayassignment;



public class Question1 {

	public static void main(String[] args) {
		
		//Java program to calculate sum values of an array
		
		int result=0;
		
		int array[]= {1,2,3,4,5,6};
		
		for(int i=0;i<array.length;i++) {
			 result = result +array[i];
		}
		
		System.out.println(result);

	}

}
