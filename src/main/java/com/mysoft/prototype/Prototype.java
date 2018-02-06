package com.mysoft.prototype;

import java.io.*;
public class Prototype implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4958227973849400428L;

	
	public String[] str;
	
	public Prototype(){
		
	}





	public String[] getStr() {
		return str;
	}





	public void setStr(String[] str) {
		this.str = str;
	}





	//浅复制,将一个对象复制后，所有的基本类型的对象都将被重新创建，但是引用类型的对象还是指向之前对象的引用
	public Object clone() throws CloneNotSupportedException{
		Prototype pro = (Prototype)super.clone();
		return pro;
	}

	//深复制，就是指不论是基本数据类型还是引用数据类型都会重新创建
	public Object deepClone() throws IOException, ClassNotFoundException{
		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		
		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}
