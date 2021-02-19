package com.test.inh;

public class Dog {
	
	private String name;
	public String color = "Parent color";
	private int age;
	private String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void wageTail() {
		System.out.println("Dog wage is tail");
	}
	
	public Object specailCapabilites()throws Exception {
		System.out.println("Dog can bark");
		return "parent";
	}

}
