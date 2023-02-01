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
	int sz=0;
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
		sz++;
		//Creating the second customer
		customers[1] = new Customer();
		customers[1].setCustomerID(102);
		customers[1].setCustomerName("Kanwaraj");
		customers[1].setCustomerAddress("Jodhpur");
		sz++;
		//creating the third customer
		customers[2] = new Customer();
		customers[2].setCustomerID(103);
		customers[2].setCustomerName("Avisha");
		customers[2].setCustomerAddress("Mumbai");
		sz++;
	}
	
	public void updateCustomer(int id) {
		//Implementation of methods
		//System.out.println("Customer is updated-->");
		int loc=-1;
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i].getCustomerID()==id)
			{
				loc = i;
				break;
			}
		}
		if(loc==-1)
		{
			System.out.println("Object not found!!");
			System.exit(0);
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name= sc.next();
		customers[loc].setCustomerName(name);
		System.out.println("Enter Customer Address: ");
		String address= sc.next();
		customers[loc].setCustomerAddress(address);
		System.out.println("Customer with id "+id+" updated.");
	}
	
	public void listCustomer() {
		//Implementation of method
//		System.out.println("Customer is listed-->");
//		System.out.println("Details of the customer--> "+c1.getCustomerID()+c1.getCustomerName()+c1.getCustomerAddress());
		
		//New syntax to print the details
		for(int i=0;i<sz;i++)
		{
			System.out.println("details of customer-->"+customers[i].getCustomerName()+"-"+customers[i].getCustomerID()+"-"+customers[i].getCustomerAddress());
		}
		
	}
	
	public boolean deleteCustomer(int id) {
		int loc=-1;
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i].getCustomerID()==id)
			{
				loc = i;
				break;
			}
		}
		if(loc==-1)
		{
			System.out.println("Object not found!!");
			System.exit(0);
		}
		for(int i=loc+1;i<customers.length;i++)
		{
			customers[i-1] = customers[i];
		}
		sz--;
		System.out.println("Customer is deleted by id " + id);
		return true;
	}
}
