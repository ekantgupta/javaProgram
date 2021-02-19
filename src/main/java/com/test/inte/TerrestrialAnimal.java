package com.test.inte;

public interface TerrestrialAnimal {

	default public void livesIn() {
		System.out.println("Lives on Land");
	}
}
