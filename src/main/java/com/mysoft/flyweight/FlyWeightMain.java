package com.mysoft.flyweight;

public class FlyWeightMain {

	public static void main(String[] args) {
		WebsiteFactory wf = new WebsiteFactory();
		
		Website one = wf.getWebsite("论坛");
		one.user(new User("小明"));
		
		Website two = wf.getWebsite("博客");
		two.user(new User("大明"));
		
		Website three = wf.getWebsite("论坛");
		three.user(new User("Tim"));
		
		
		System.out.println("website类型实例数："+wf.getTotal());
	}
}
