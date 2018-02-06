package com.mysoft.builder;

public class BuildTwo extends ProductBuilder{

	private Product product = new Product();

	@Override
	public void buildA() {
		// TODO Auto-generated method stub
		product.addPart("buildTwoA");
	}

	@Override
	public void buildB() {
		// TODO Auto-generated method stub
		product.addPart("buildTwoB");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
