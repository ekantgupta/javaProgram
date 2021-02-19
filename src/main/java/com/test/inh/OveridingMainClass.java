package com.test.inh;

public class OveridingMainClass {

	public static void main(String[] args) throws Exception {
//		Dog dog = new Dog(); // Dyanamic polymorphism means at run time jvm will decide which class method will be called. based on object created for which class
//		dog.specailCapabilites();
//		
//		Labrador labrador = new Labrador();
//		labrador.specailCapabilites();
//		
		// Upcasting
//		Dog dog = new Labrador();// Dyanamic polymorphism means at run time jvm will decide which class method will be called. based on object created for which class
//		dog.specailCapabilites();
		
		Dog dogRef = new Labrador();
		//System.out.println(dogRef.color); // We can not override data member of parent class even we create an object of child class
		dogRef.specailCapabilites();
		//System.out.println(dogRef.getColor());// Called parent class method as child did not override the getColor method.
	}

}
