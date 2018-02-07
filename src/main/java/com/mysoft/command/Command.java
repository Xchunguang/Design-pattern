package com.mysoft.command;

public abstract class Command {

	public Cooker cooker;

	public Command(Cooker cooker) {
		super();
		this.cooker = cooker;
	}
	
	public abstract void doCommand();
}
