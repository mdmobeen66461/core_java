package com.zensar.arrayassignment;

public class Question2 {

	public static void main(String[] args) {
		
		int result=0;
		int i=0;
		int numArray[]= {10,20,30,40,50};
		
		for(i=0;i<numArray.length;i++) {
			
			if(numArray[i]==30) {
				result++;
				break;
			}
			
		}
		
		if(result==1) {
			System.out.println("Available At Position :"+i);
		}else {
			System.out.println("Not Available....");
		}

	}

}
