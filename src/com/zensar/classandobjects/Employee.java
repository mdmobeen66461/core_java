package com.zensar.classandobjects;

public class Employee {
	
	int eId;
	String eName;
	double salary;
	int deptNo;
	String job;
	
	
	void display() {
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(salary);
		System.out.println(deptNo);
		System.out.println(job);
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eId=10;
		emp1.eName="Mubeen";
		emp1.salary=200000;
		emp1.deptNo=2;
		emp1.job="Software Developer";
		
		
		Employee emp2=new Employee();
		emp2.eId=11;
		emp2.eName="Sameer";
		emp2.salary=30000;
		emp2.deptNo=3;
		emp2.job="Web Developer";
		
		emp1.display();
		emp2.display();
	}

}
