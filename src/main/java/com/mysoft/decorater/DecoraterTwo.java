package com.mysoft.decorater;

public class DecoraterTwo extends Decorater{
	Person person;

	public DecoraterTwo(Person persion) {
		super(persion);
		this.person = persion;
	}
	
	public void show(){
		System.out.println("装饰Two");
		person.show();
	}

}
