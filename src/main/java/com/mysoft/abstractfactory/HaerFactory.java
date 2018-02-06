package com.mysoft.abstractfactory;

public class HaerFactory extends AbstractFactory{

	@Override
	public Frige createFrige() {
		// TODO Auto-generated method stub
		return new HaerFrige();
	}

	@Override
	public Tv createTv() {
		// TODO Auto-generated method stub
		return new HaerTv();
	}

}
