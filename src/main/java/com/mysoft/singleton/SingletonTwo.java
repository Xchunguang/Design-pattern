package com.mysoft.singleton;
/**
 * 使用内部类维护单例,JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕。
 * 问题：如果在构造函数中抛出异常，实例将永远得不到创建，也会出错
 * @author xuchg1
 *
 */
public class SingletonTwo {

	private SingletonTwo(){
		
	}
	
	public static class SingletonFactory {
		private static SingletonTwo instance = new SingletonTwo();
	}
	
	public SingletonTwo getInstance(){
		return SingletonFactory.instance;
	}
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
		return getInstance();  
	} 
	
}
