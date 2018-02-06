package com.mysoft.abstractfactory;

public class TclFactory extends AbstractFactory{

	@Override
	public Frige createFrige() {
		// TODO Auto-generated method stub
		return new TclFrige();
	}

	@Override
	public Tv createTv() {
		// TODO Auto-generated method stub
		return new TclTv();
	}

	
}
