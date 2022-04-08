package com.zensar.classandobjects;

public class Student {
   int studentId;
   String studentName;
   char grade;
   
   void display() {
	   System.out.println(studentId+" "+studentName+" "+grade);
   }
   
   
   void getValues(int studentId,String studentName,char grade) {
	   this.studentId=studentId;
	   this.studentName=studentName;
	   this.grade=grade;
   }

}
