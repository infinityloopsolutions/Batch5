package com.example;

public class CallByReference {
	int a=100;
	int b;

	public static void main(String[] args) {
		CallByReference c1 = new CallByReference();
		System.out.println("c1.a : "+c1.a);
		System.out.println("c1.b :"+c1.b);
		CallByReference c2 = new CallByReference();
		c2.b = 200;
		System.out.println("c2.a : "+c2.a);
		System.out.println("c2.b :"+c2.b);
		CallByReference c3 = c2;
		System.out.println("c3.a : "+c3.a);
		System.out.println("c3.b :"+c3.b);
		c2.a = 1001;
		c3.b = 2002;
		System.out.println("after change..");
		System.out.println("c2.a : "+c2.a);
		System.out.println("c2.b :"+c2.b);
		System.out.println("c3.a : "+c3.a);
		System.out.println("c3.b :"+c3.b);

	}

}
