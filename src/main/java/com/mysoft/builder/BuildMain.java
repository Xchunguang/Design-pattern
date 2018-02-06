package com.mysoft.builder;

public class BuildMain {

	public static void main(String[] args) {
		ProductBuilder p1 = new BuildOne();
		ProductBuilder p2 = new BuildTwo();
		Director director = new Director();
		
		director.build(p1);
		p1.getResult().show();
		
		director.build(p2);
		p2.getResult().show();
	}
}
