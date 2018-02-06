package com.mysoft.iterator;

public interface Collection<T> {

	public Iterator<T> iterator();
	
	public T get(int i);
	
	public void put(T o);
	
	public int size();
	
}
