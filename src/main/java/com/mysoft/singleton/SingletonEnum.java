package com.mysoft.singleton;
/**
 * 枚举可以简单实现线程安全的单例
 * 枚举的三个特性：线程安全，自由序列化，保证单例
 * 枚举时由class实现的，枚举是final类，并包含private构造器
 * @author xuchg1
 *
 */
public enum SingletonEnum {
 	INSTANCE;
    public void otherMethods(){
        System.out.println("do something");
    }
}
