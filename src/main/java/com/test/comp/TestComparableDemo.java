package com.test.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparableDemo {

	public static void main(String[] args) {
		List<Empolyee> empList = Arrays.asList(new Empolyee(7, "Ekant", "Pune", 38),
											   new Empolyee(10, "Amit", "Mainpuri", 42),
											   new Empolyee(1, "Ankit", "Merrut", 30),
											   new Empolyee(8, "Swati", "Delhi", 32),
											   new Empolyee(11, "Lovlesh", "Kanpur", 40),
											   new Empolyee(4, "Deepak", "Jharkand", 28),
											   new Empolyee(9, "Chirag", "Rajkot", 35),
											   new Empolyee(5, "Pawan", "Ganganagar", 36));
		
		Collections.sort(empList);
		System.out.println("=============================================================");
		System.out.println("Employee sorted with Natural Order : " + empList);
		System.out.println("=============================================================");
		Collections.sort(empList, EmployeeComparator.NameComparator);
		System.out.println("Sorted by Employee Name : " + empList);
		System.out.println("=============================================================");
		Collections.sort(empList, EmployeeComparator.addressComparator);
		System.out.println("Sorted by Employee Address  : " + empList);
		System.out.println("=============================================================");
		Collections.sort(empList, EmployeeComparator.ageComparator);
		System.out.println("Sorted by Employee Age : " + empList);
		System.out.println("=============================================================");
	}

}
