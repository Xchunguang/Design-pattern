package com.mysoft.prototype;

import java.io.IOException;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		//浅克隆
		Prototype pro = new Prototype();
		String[] str = {"123","456"};
		pro.setStr(str);
		
		
		Prototype pro1 = (Prototype) pro.clone();
		pro1.getStr()[1] = "123";
		pro1.getStr()[0] = "456";
		
		System.out.println(pro.getStr()[0]);
		System.out.println(pro.getStr()[1]);
		
		//深克隆
		Prototype deepPro = new Prototype();
		String[] deepStr = {"abc","edf"};
		deepPro.setStr(deepStr);
		
		Prototype deepPro1 = (Prototype) deepPro.deepClone();
		deepPro1.getStr()[1] = "edf";
		deepPro1.getStr()[0] = "abc";

		System.out.println(deepPro.getStr()[0]);
		System.out.println(deepPro.getStr()[1]);
		
		
	}
}
