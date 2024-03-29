package com.cjafet.builder;

public class CreateOrder {
	
	public static class Builder {
		private double price;
		private String currency;
		private double volume;
		
		public Builder() {
			
		}
		
		public CreateOrder build( ) {
			return new CreateOrder(this);
		}
		
		public Builder price(double price) {
			this.price = price;
			return this; // return a build object
		}
		
		public Builder currency(String currency) {
			this.currency = currency;
			return this; // return a build object
		}
		
		public Builder volume(double volume) {
			this.volume = volume;
			return this; // return a build object
		}	
		
	}
	
	private final double price;
	private final String currency;
	private final double volume;
	
	private CreateOrder(Builder builder) {
		this.price = builder.price;
		this.currency = builder.currency;
		this.volume = builder.volume;
	}
	
	public double getPrice( ) {
		return price;
	}
	
	public String getCurrency( ) {
		return currency;
	}
	
	public double getVolume( ) {
		return volume;
	}

}
