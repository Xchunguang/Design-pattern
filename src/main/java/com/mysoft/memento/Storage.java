package com.mysoft.memento;
/**
 * 保存备忘录的类
 * @author xuchg1
 *
 */
public class Storage {

	public Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Storage(Memento memento) {
		super();
		this.memento = memento;
	}
	
	
}
