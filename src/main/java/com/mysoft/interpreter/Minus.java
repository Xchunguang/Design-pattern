package com.mysoft.interpreter;

public class Minus implements Expression{

	@Override
	public int interpre(Content content) {
		// TODO Auto-generated method stub
		return content.getNum1() - content.getNum2();
	}

}
