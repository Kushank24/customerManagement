package com.flipkart.service;

public class PaymentService extends CustomerServiceOperations{
	@Override
	public void testOverride() {
		System.out.println("Child Class");
	}
}
