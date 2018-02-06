package com.mysoft.observer;
/**
 * 被通知者抽象类
 * @author xuchg1
 *
 */
public abstract class ObServer {

	public String name;
	
	public ObServer(String name){
		this.name = name;
	}
	
	public abstract void update();
}
