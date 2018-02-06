package com.mysoft.iterator;

public class IteratoraMain {

	public static void main(String[] args) {
		Collection<String> collection = new MyCollection<String>();
		collection.put("a");
		collection.put("b");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		collection.put("c");
		Iterator<String> iterator = collection.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
