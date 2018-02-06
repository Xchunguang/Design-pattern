package com.mysoft.builder;
/**
 * 提供建造的方法，子类实现该类，必须要实现该类的所有方法，保证不会丢失工序
 * @author xuchg1
 *
 */
public abstract class ProductBuilder {

	public abstract void buildA();
	
	public abstract void buildB();
	
	public abstract Product getResult();
}
