package com.mysoft.abstractfactory;

public abstract class Tv {

	
	
	public String name;

	public Tv(String name){
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
		return "Tv [name=" + name + "]";
	}
	
	
}
