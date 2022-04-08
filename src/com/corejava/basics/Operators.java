package com.corejava.basics;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Sum of a and b is : "+(a+b));
		System.out.println("Sub of a and b is : "+(b-a));
		System.out.println("Mul of a and b is : "+(a*b));
		System.out.println("Div of a and b is : "+(a/b));
		System.out.println("Rem of a and b is : "+(a%b));
		
		
		
		//Relational Operators (Comparison operators)--->== < > <= >= !=
		//Always return boolean value
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical operators && || !
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		
		

	}

}
