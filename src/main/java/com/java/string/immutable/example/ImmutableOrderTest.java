package com.java.string.immutable.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImmutableOrderTest {
	
	public static void main(String[] args) {
		ImmutableOrder immutableOrder = new ImmutableOrder(1001, "VU 32 LED Smart TV");
		log.info("Order Num: {}", immutableOrder.orderNumber);
		log.info("Product Name: {}", immutableOrder.productName);
//		log.info("Changing Immutable Object content");
//		immutableOrder.productName = "VU 43 LED Smart TV";
	}
}
