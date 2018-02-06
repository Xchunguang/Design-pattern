package com.mysoft.decorater;

public class Person {
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void show(){
		System.out.println("I am "+this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
