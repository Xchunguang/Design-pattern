package com.mysoft.strategy;

public class StrategyContext {

	StrategyInfo si;
	
	
	
	public StrategyContext(StrategyInfo si) {
		super();
		this.si = si;
	}



	public void doContext(){
		String result = si.doStrategy();
		System.out.println(result);
	}
}
