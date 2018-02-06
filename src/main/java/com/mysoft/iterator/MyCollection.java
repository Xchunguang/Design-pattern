package com.mysoft.iterator;

import java.util.Arrays;

public class MyCollection<T> implements Collection<T>{

	public int size = 10;

	public Object[] arr  = new Object[size];

	public int index = -1;

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return (T) arr[i];
	}

	@Override
	public void put(T o) {
		// TODO Auto-generated method stub
		if(index<size-1){
			arr[++index] = o;

		}else{
			int oldCapacity = size;
			int size = oldCapacity + (oldCapacity >> 1);
			arr = Arrays.copyOf(arr, size);
			arr[++index] = o;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index+1;
	}



}
