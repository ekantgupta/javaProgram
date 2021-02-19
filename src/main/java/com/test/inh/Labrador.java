package com.test.inh;

public class Labrador extends Dog{
	
	public String color = "Child color";
	
	public String specailCapabilites()throws RuntimeException {
		System.out.println("I am an athletic Dog");
		return "Covriant type";
	}

}
