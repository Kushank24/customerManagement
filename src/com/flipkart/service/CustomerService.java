package com.flipkart.service;

public interface CustomerService {
	//Declaration of the services in interface
	public void createCustomer();
	public void updateCustomer(int id);
	public void listCustomer();
	public boolean deleteCustomer(int id);
}
