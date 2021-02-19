package com.test.equ.and.hash;

public class TestEqualsAndHash {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Ekant");
		
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("Ekant");
		
		System.out.println("Employees are equal by == " + (e1 == e2));
		System.out.println("Employees are equal by equals methods " + (e1.equals(e2)));
	}

}
