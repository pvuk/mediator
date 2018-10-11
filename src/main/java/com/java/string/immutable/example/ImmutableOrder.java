package com.java.string.immutable.example;

public final class ImmutableOrder {
	
	final long orderNumber;
	final String productName;
	
	public ImmutableOrder(long orderNumber, String productName) {
		this.orderNumber = orderNumber;
		this.productName = productName;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public String getProductName() {
		return productName;
	}
	
}
