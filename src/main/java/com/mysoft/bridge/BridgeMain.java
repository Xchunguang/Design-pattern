package com.mysoft.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		Mobile mobile = new MobileOne("索泥T47");
		mobile.setHandsetsoft(new Game());
		mobile.run();
		mobile.setHandsetsoft(new Photo());
		mobile.run();
		
		Mobile mobile1 = new MobileOne("叁星G27");
		mobile1.setHandsetsoft(new Game());
		mobile1.run();
		mobile1.setHandsetsoft(new Photo());
		mobile1.run();
	}
}
