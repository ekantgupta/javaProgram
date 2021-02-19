package com.test.inte;

public interface AquanticAnimal {
	default public void livesIn() {
		System.out.println("Lives on Water");
	}
}
