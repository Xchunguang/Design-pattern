package com.mysoft.chainofresponsibility;

public class HandlerTwo extends Handler{

	public HandlerTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doRequest(int request) {
		// TODO Auto-generated method stub
		if(request<20){
			System.out.println("handle two request");
		}else{
			if(uper != null){
				uper.doRequest(request);
			}
		}
	}

}
