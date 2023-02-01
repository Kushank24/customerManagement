package com.flipkart.service;

import java.util.Scanner;
import java.util.*;

import com.flipkart.bean.Customer;

public class CustomerServiceOperations implements CustomerService{
	// declare all the possible methods of customer service
	public void testOverride() {
		System.out.println("Base Class");
	}
	
	//Customer c1 = new Customer();
	
	Customer customers[] = new Customer[3];
	
	public void createCustomer() {
		// Implementation of method
		// var // Object
		//First Record of Customer
		//Customer c1 = new Customer();
		
		//Creating the first customer
		
		customers[0] = new Customer();
		customers[0].setCustomerID(101);
		customers[0].setCustomerName("Kushank");
		customers[0].setCustomerAddress("Flipkart");
		
		//Creating the second customer
		customers[1] = new Customer();
		customers[1].setCustomerID(102);
		customers[1].setCustomerName("Kanwaraj");
		customers[1].setCustomerAddress("Jodhpur");
		
		//creating the third customer
		customers[2] = new Customer();
		customers[2].setCustomerID(103);
		customers[2].setCustomerName("Avisha");
		customers[2].setCustomerAddress("Mumbai");
		
	}
	
	public void updateCustomer(int id) {
		//Implementation of methods
		//System.out.println("Customer is updated-->");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name= sc.next();
		customers[id].setCustomerName(name);
		System.out.println("Enter Customer Address: ");
		String address= sc.next();
		customers[id].setCustomerAddress(address);
		System.out.println("Customer with id "+id+" updated.");
	}
	
	public void listCustomer() {
		//Implementation of method
//		System.out.println("Customer is listed-->");
//		System.out.println("Details of the customer--> "+c1.getCustomerID()+c1.getCustomerName()+c1.getCustomerAddress());
		
		//New syntax to print the details
		for(Customer cust:customers)
		{
			System.out.println("details of customer-->"+cust.getCustomerName()+"-"+cust.getCustomerID()+"-"+cust.getCustomerAddress());
		}
		
	}
	
	public boolean deleteCustomer(int id) {
		for(int i=id+1;i<customers.length;i++)
		{
			customers[i-1] = customers[i];
		}
		System.out.println("Customer is deleted by id " + id);
		return true;
	}
}
