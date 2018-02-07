package com.mysoft.visitor;

public class VisitorMain {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		
		sub.accept(visitor);
	}
}
