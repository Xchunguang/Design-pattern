package com.mysoft.chainofresponsibility;

public class ChainMain {

	public static void main(String[] args) {
		
		Handler one = new HandlerOne();
		Handler two = new HandlerTwo();
		Handler three = new HandlerThree();
		
		one.setHandler(two);
		two.setHandler(three);
		
		int[] request = {1,23,42,1,41,22,3,5,23,12,3};
		
		for(int i=0;i<request.length;i++){
			one.doRequest(request[i]);
		}
	}
}
