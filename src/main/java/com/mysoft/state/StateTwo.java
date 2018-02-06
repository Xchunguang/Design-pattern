package com.mysoft.state;

public class StateTwo extends State{

	@Override
	public void handler(Content content) {
		// TODO Auto-generated method stub
		content.state = new StateOne();
	}

}
