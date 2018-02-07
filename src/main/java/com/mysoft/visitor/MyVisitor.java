package com.mysoft.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject sub) {
		// TODO Auto-generated method stub
		System.out.println(sub.getSubject());
	}
	
}
