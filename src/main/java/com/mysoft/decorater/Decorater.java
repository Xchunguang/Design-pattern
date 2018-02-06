package com.mysoft.decorater;

public class Decorater extends Person{

	Person persion;

	
	public Decorater( Person persion) {
		super(persion.getName());
		this.persion = persion;
	}


	public void show(){
		persion.show();
	}
}
