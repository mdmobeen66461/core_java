package com.zensar.constructors;

public class Assignment1 {

	int a;
	int b;
	int c;

	public Assignment1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int sum() {
		return a+b+c;
	}
	public static void main(String[] args) {
		Assignment1 assignment1=new Assignment1(10, 20, 30);
		
		System.out.println(assignment1.sum());
	}

}


