package com.mysoft.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		StrategyContext sc = new StrategyContext(new StrategyInfoOne());
		sc.doContext();
		sc = new StrategyContext(new StrategyInfoTwo());
		sc.doContext();
	}
}
