package com.test.inh;

public class OverloadingDemo {

//	public void add(int a, int b) {
//		System.out.println("Add methods with 2 agruments : " + (a+b));
//	}
//	
	public void add(int a, int b, int c) {
		System.out.println("Add methods with 3 agruments : " + (a + b + c));
	}

	public void add(int a, long b) {
		System.out.println("Add methods with 2 agruments with b long data type : " + (a + b));
	}

	public void add(long a, int b) {
		System.out.println("Add methods with 2 agruments with 1 long data type : " + (a + b));
	}

}
