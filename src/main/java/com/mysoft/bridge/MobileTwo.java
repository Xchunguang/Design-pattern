package com.mysoft.bridge;

public class MobileTwo extends Mobile{

	public MobileTwo(String name) {
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
