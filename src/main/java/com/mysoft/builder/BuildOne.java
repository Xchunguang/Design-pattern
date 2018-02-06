package com.mysoft.builder;

public class BuildOne extends ProductBuilder{

	private Product product = new Product();
	
	@Override
	public void buildA() {
		// TODO Auto-generated method stub
		product.addPart("BuildoneA");
	}

	@Override
	public void buildB() {
		// TODO Auto-generated method stub
		product.addPart("BuildoneB");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
