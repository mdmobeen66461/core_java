package com.zensar.constructors;

public class Assignment2 {
	
	int sId;
	String sName;
	int sub1;
	int sub2;
	int sub3;
	
	
	
	public void getStuData(int sId,String sName) {
		
	}
	
	public void getStuMarks(int sub1, int sub2, int sub3) {
		
	}
	
	public void  totalMarks() {
		System.out.println(sub1+sub2+sub3);
	}
	
	
	public static void main(String[] args) {
		Assignment2 assignment2=new Assignment2();
		
		assignment2.getStuData(1, "mubeen");
		assignment2.getStuMarks(70, 80, 60);
		assignment2.totalMarks();
	}
	

}
