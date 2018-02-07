package com.mysoft.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter { 

	private List<Command> orders = new ArrayList<Command>();
	
	public void addOrder(Command command){
		orders.add(command);
	}
	
	public void cancelOrder(Command command){
		orders.remove(command);
	}
	
	public void notifyCooker(){
		orders.forEach(e->{
			e.doCommand();
		});
	}
}
