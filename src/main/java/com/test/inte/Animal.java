package com.test.inte;

public interface Animal {
	
	void specialCapebilities();
	
	default void legs() {
		System.out.println("Animal has 4 legs");
	}
}
