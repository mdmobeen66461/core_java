package com.zensar.classandobjects;

public class StudentClient {

	public static void main(String[] args) {
		
		Student student=new Student();
//		student.studentId=1;
//		student.studentName="Mubeen";
//		student.grade='A';
		
		student.getValues(1, "Sameer", 'A');
		
		student.display();
	}

}
