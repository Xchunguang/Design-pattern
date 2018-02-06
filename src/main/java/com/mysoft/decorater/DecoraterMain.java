package com.mysoft.decorater;

public class DecoraterMain {

	public static void main(String[] args) {
		Person person = new Person("xcg");
		
		DecoraterOne one = new DecoraterOne(person);
		
		DecoraterTwo two = new DecoraterTwo(one);
		
		two.show();
	}
}
