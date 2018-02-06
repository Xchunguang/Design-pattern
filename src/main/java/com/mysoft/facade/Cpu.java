package com.mysoft.facade;

public class Cpu implements MechineState{

	public void startUp(){
		System.out.println("Cpu start");
	}

	public void shutDown() {
		System.out.println("Cpu shutdown");
	}
}
