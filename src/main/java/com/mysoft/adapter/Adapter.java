package com.mysoft.adapter;

public class Adapter extends Target{

	private Adaptee adaptee;
	
	public Adapter(){
		super();
		adaptee = new Adaptee();
	}
	@Override
	public void doRequest() {
		// TODO Auto-generated method stub
		System.out.println("开始适配");
		adaptee.unKnowRequest();
	}

}
