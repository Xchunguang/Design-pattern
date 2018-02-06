package com.mysoft.state;

public class Content {

	public State state;
	
	public Content(State state){
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void doRequest(){
		state.handler(this);
	}
	
	
	
}
