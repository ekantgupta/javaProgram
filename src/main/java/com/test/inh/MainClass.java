package com.test.inh;

public class MainClass {

	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		
//		od.add(2, 3);
//		
//		od.add(2, 3, 5);
//		
//		od.add(4, 5l);
		
		//od.add(2, 4);// he method add(int, long) is ambiguous for the type OverloadingDemo. Because of automatic type promotion in java
	}

}
