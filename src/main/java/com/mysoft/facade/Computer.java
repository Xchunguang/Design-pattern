package com.mysoft.facade;

public class Computer implements MechineState{

	Cpu cpu ;
	Disk disk ;
	Memery memery;
	
	public Computer(){
		cpu = new Cpu();
		disk = new Disk();
		memery = new Memery();
		
	}
	
	public void startUp() {
		// TODO Auto-generated method stub
		cpu.startUp();
		disk.startUp();
		memery.startUp();
	}

	public void shutDown() {
		// TODO Auto-generated method stub
		cpu.shutDown();
		disk.shutDown();
		memery.shutDown();
		
	}

}
