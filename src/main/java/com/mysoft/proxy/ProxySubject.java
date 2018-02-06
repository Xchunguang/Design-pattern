package com.mysoft.proxy;

public class ProxySubject implements ProxySource{

	RealSubject real = null;
	
	public ProxySubject(){
		super();
		real = new RealSubject();
	}
	
	public void doRequest(){
		real.doRequest();
	}
	
}
