package com.mysoft.iterator;

public class MyIterator<T> implements Iterator<T>{

	private Collection<T> collection;
	
	
	
	public MyIterator(Collection<T> collection) {
		super();
		this.collection = collection;
	}

	private int index = -1;
	@Override
	public T first() {
		// TODO Auto-generated method stub
		return collection.get(0);
	}

	@Override
	public T pre() {
		// TODO Auto-generated method stub
		if(index>0){
			return collection.get(--index);
		}
		return null;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		if(index < collection.size()-1){
			return collection.get(++index);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < collection.size()-1){
			return true;
		}
		return false;
	}

}
