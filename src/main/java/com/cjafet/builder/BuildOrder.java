package com.cjafet.builder;

public class BuildOrder {

	public static void main (String args[]) {
		CreateOrder.Builder order = new CreateOrder.Builder();
		
		order.price(15.50).currency("EURO").volume(1500);
		
		CreateOrder createOrder = order.build();
		
		System.out.println(createOrder.getPrice());
		System.out.println(createOrder.getCurrency());
		System.out.println(createOrder.getVolume());
		
	}
}
