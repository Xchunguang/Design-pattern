package com.mysoft.composite;

public abstract class Component {

	public String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void display(int depth);
}
