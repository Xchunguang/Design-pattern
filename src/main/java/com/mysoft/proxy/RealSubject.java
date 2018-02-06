package com.mysoft.proxy;

public class RealSubject implements ProxySource{

	public void doRequest(){
		System.out.println("this is real subject");
	}
}
