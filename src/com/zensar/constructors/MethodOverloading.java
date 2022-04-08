package com.zensar.constructors;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(double a, int b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		
		mo.add(10, 20);
		mo.add(10.0, 10.0);
		mo.add(10.0, 10);
		mo.add(10, 11.0);
	}

}
