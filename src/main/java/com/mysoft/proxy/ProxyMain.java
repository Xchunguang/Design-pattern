package com.mysoft.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		ProxySource proxy = new ProxySubject();
		proxy.doRequest();
	}
}
