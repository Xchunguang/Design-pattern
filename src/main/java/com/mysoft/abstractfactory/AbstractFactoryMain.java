package com.mysoft.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		AbstractFactory af = new HaerFactory();
		Frige frige = af.createFrige();
		Tv tv = af.createTv();
		
		System.out.println(frige.toString());
		System.out.println(tv.toString());
		
		AbstractFactory af1 = new TclFactory();
		frige = af1.createFrige();
		tv = af1.createTv();
		
		
		System.out.println(frige.toString());
		System.out.println(tv.toString());
		
	}
}
