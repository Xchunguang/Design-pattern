package com.mysoft.flyweight;

public class WebsiteOne extends Website{

	public String name;
	
	
	public WebsiteOne(String name) {
		super();
		this.name = name;
	}


	@Override
	public void user(User user) {
		// TODO Auto-generated method stub
		System.out.println("分类："+name+"  用户："+user.getName());
	}
	

	
}
