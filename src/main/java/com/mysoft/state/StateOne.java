package com.mysoft.state;

public class StateOne extends State{

	@Override
	public void handler(Content content) {
		// TODO Auto-generated method stub
		content.state = new StateTwo();
	}

}
