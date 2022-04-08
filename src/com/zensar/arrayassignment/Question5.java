package com.zensar.arrayassignment;

public class Question5 {

	public static void main(String[] args) {
		
		
		int maxMinArray[]= {10,1,20,3,40,50,100,0};
		
		 // assign first array element to two variables
	    int max = maxMinArray[0];
	    int min = maxMinArray[0];
	    // iterate and compare from array index 1
	    for(int i = 1; i < maxMinArray.length; i++){
	      if(max < maxMinArray[i]){
	        max = maxMinArray[i];
	      }else if(min > maxMinArray[i]){
	        min = maxMinArray[i];
	      }		   		   
	    }
	    
	    System.out.println("Maximum Element :"+max);
	    System.out.println("Maximum Element :"+min);
	}

}
