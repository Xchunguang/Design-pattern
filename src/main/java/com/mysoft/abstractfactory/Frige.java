package com.mysoft.abstractfactory;

public abstract class Frige {

	public String name;
	
	public Frige(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Frige [name=" + name + "]";
	}
	
}

