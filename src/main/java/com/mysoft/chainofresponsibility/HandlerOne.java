package com.mysoft.chainofresponsibility;

public class HandlerOne extends Handler{

	public HandlerOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doRequest(int request) {
		// TODO Auto-generated method stub
		if(request<10){
			System.out.println("handle one request");
		}else{
			if(uper != null){
				uper.doRequest(request);
			}
		}
	}

	
}
