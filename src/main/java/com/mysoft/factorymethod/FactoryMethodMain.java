package com.mysoft.factorymethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
		Provider provider = new SendMailProvider();
		Sender sender = provider.produce();
		sender.send();
	}
}
