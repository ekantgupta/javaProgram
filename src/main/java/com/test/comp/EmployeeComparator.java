package com.test.comp;

import java.util.Comparator;

public class EmployeeComparator{
	
	public static Comparator<Empolyee> NameComparator = new Comparator<Empolyee>() {

		@Override
		public int compare(Empolyee o1, Empolyee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}; 
	
	public static Comparator<Empolyee> addressComparator = new Comparator<Empolyee>() {

		@Override
		public int compare(Empolyee o1, Empolyee o2) {
			return o1.getAddress().compareTo(o2.getAddress());
		}
	};
	
	public static Comparator<Empolyee> ageComparator = new Comparator<Empolyee>() {

		@Override
		public int compare(Empolyee o1, Empolyee o2) {
			return o1.getAge() - o2.getAge();
		}
	};
	
	
	

}
