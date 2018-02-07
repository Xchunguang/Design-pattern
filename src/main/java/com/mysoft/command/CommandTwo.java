package com.mysoft.command;

public class CommandTwo extends Command{

	public CommandTwo(Cooker cooker) {
		super(cooker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand() {
		// TODO Auto-generated method stub
		cooker.makePie();
	}

	
}
