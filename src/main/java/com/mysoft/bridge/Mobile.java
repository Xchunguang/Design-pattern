package com.mysoft.bridge;

public abstract class Mobile {

	public HandsetSoft handsetsoft ;

	public String name;
	
	
	
	public Mobile(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HandsetSoft getHandsetsoft() {
		return handsetsoft;
	}

	public void setHandsetsoft(HandsetSoft handsetsoft) {
		this.handsetsoft = handsetsoft;
	}
	
	public abstract void run();
}
