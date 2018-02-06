package com.mysoft.observer;

public class ObServerMain {

	public static void main(String[] args) {
		Notifyer notifyer = new NotifyerOne();
		
		ServerOne one = new ServerOne("hero");
		
		ServerTwo two = new ServerTwo("lero");
		
		notifyer.addServer(one);
		notifyer.addServer(two);
		
		notifyer.notifyAllServer();
		
	}
}
