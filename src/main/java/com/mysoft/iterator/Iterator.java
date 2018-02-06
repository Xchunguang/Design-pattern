package com.mysoft.iterator;

public interface Iterator<T> {

	public T first();
	
	public T pre();
	
	public T next();
	
	public boolean hasNext();
}
