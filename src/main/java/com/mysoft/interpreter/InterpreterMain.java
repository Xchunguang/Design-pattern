package com.mysoft.interpreter;

public class InterpreterMain {

	public static void main(String[] args) {
		//4+2-5
		int result = new Minus().interpre(new Content(new Plus().interpre(new Content(4,2)),5));
		System.out.println(result);
	}
}
