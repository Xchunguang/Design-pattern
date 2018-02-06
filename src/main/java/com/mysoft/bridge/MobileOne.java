package com.mysoft.bridge;

public class MobileOne extends Mobile{

	public MobileOne(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name);
		handsetsoft.run();
	}

}
