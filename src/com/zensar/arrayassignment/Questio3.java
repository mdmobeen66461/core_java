package com.zensar.arrayassignment;

public class Questio3 {

	public static void main(String[] args) {
		
		int i=0,result=0;
		String strArray[]= {"Mubeen","Sameer","Ravi","Raju"};
		
		for(i=0;i<strArray.length;i++) {
			//System.out.println(strArray[i]);
			
			if(strArray[i]=="Raju") {
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
