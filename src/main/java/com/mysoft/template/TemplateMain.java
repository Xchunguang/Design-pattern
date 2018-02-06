package com.mysoft.template;

public class TemplateMain {

	public static void main(String[] args) {
		TemplateSource tmp = new TemplateOne();
		tmp.doTemplate();
		tmp = new TemplateTwo();
		tmp.doTemplate();
	}
}
