package com.mysoft.state;

public class StateMain {

	public static void main(String[] args) {
		Content content = new Content(new StateOne());
		System.out.println(content.getState().getClass().getName());
		
		content.doRequest();
		System.out.println(content.getState().getClass().getName());
		
		content.doRequest();
		System.out.println(content.getState().getClass().getName());
		
		content.doRequest();
		System.out.println(content.getState().getClass().getName());
	}
}
