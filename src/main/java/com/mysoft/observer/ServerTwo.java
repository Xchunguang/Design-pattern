package com.mysoft.observer;

public class ServerTwo extends ObServer{

	public ServerTwo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"收到通知，开始执行Two");
	}

	
}
