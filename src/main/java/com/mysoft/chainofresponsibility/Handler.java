package com.mysoft.chainofresponsibility;

public abstract class Handler {

	protected Handler uper;

	public Handler() {
		super();
	}
	
	public void setHandler(Handler uper){
		this.uper = uper;
	}
	
	public abstract void doRequest(int request);
}
