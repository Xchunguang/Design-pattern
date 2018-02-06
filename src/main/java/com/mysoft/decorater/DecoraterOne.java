package com.mysoft.decorater;

public class DecoraterOne extends Decorater{

	Person person;
	
	public DecoraterOne(Person persion) {
		super(persion);
		// TODO Auto-generated constructor stub
		this.person = persion;
	}
	
	public void show(){
		System.out.println("装饰One");
		person.show();
	}

}
