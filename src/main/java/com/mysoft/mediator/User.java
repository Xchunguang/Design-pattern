package com.mysoft.mediator;

public abstract class User {

	Mediator mediator;

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void work();
}
