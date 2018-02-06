package com.mysoft.factorymethod;

public class SendMailProvider implements Provider{

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SendMailSender();
	}


	
}
