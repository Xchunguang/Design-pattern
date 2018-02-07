package com.mysoft.command;

public class CommandMain {

	public static void main(String[] args) {
		Cooker cooker = new Cooker();
		Command one = new CommandOne(cooker);
		Command two = new CommandTwo(cooker);
		
		Waiter waiter = new Waiter();
		waiter.addOrder(one);
		waiter.addOrder(two);
		
		waiter.notifyCooker();
	}
}
