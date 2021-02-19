package com.test.inte;

public class Frog implements Animal,TerrestrialAnimal, AquanticAnimal{

	public void specialCapebilities() {
		System.out.println("Frog is an amphibian animal");
		System.out.println("Frog can live in both land and water");
	}

	@Override
	public void livesIn() {
		AquanticAnimal.super.livesIn();
		TerrestrialAnimal.super.livesIn();
	}

	
}
