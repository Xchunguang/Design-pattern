package com.mysoft.mediator;

public class MyMediator implements Mediator{

	User user1;
	User user2;
	
	
	
	public MyMediator() {
		super();
		
	}

	@Override
	public void createMediator() {
		// TODO Auto-generated method stub
		user1 = new UserOne(this);
		user2 = new UserTwo(this);
	}

	@Override
	public void workAll() {
		// TODO Auto-generated method stub
		user1.work();
		user2.work();
	}

	
}
