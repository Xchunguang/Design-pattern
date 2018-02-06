package com.mysoft.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> parts = new ArrayList<String>();
	
	public void addPart(String part){
		parts.add(part);
	}
	
	public void show(){
		parts.forEach(e -> {
			System.out.println(e);
		});
	}
}
