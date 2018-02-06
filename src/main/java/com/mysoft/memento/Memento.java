package com.mysoft.memento;
/**
 * 备忘录类
 * @author xuchg1
 *
 */
public class Memento {

	public String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Memento(String value) {
		super();
		this.value = value;
	}
	
}
