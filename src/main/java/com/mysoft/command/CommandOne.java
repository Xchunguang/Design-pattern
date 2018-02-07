package com.mysoft.command;

public class CommandOne extends Command{

	public CommandOne(Cooker cooker) {
		super(cooker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand() {
		// TODO Auto-generated method stub
		cooker.makeCookie();
	}

}
