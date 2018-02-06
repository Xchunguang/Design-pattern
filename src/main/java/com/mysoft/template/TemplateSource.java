package com.mysoft.template;

public abstract class TemplateSource {

	int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public abstract void addTotalOne();
	
	public abstract void addTotalTwo();
	
	public void doTemplate(){
		this.addTotalOne();
		this.addTotalTwo();
		System.out.println(this.total);
	}
	
	
}
