package com.example;

public class CallByValue {

	public static void main(String[] args) {
		int a = 100;
		int b = a;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("after change..");
		a = 20;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		

	}

}
