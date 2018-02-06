package com.mysoft.memento;
/**
 * 原始类，需要被保存的类
 * @author xuchg1
 *
 */
public class Original {

	public String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		super();
		this.value = value;
	}
	
	public Memento createMemento(){
		return new Memento(this.value);
	}
	
	public void resetMemento(Memento memento){
		this.value = memento.getValue();
	}
}
