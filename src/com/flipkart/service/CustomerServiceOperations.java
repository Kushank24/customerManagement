package com.flipkart.service;

import com.flipkart.bean.Customer;

import java.util.*;

import com.flipkart.bean.Customer;

public class CustomerServiceOperations implements CustomerService{
	// declare all the possible methods of customer service
	public void testOverride() {
		System.out.println("Base Class");
	}
	
	List<Customer> customers = new ArrayList<Customer>();
	Scanner sc= new Scanner(System.in);
	public void createCustomer() {
		System.out.println("Enter the number of users to be created: ");
    	int id;
    	int num = sc.nextInt();
    	for(int i=0;i<num;i++)
    	{
    		Customer item = new Customer();
    		System.out.println("Enter customer id: ");
        	id= sc.nextInt();
        	item.setCustomerID(id);
        	System.out.println("Enter Customer Name: ");
    		String name= sc.next();
    		item.setCustomerName(name);
    		System.out.println("Enter Customer Address: ");
    		String address= sc.next();
    		item.setCustomerAddress(address);
    		customers.add(item);
    	}
    	System.out.println("\n");
	}
	
	public void updateCustomer(int id) {
		//Implementation of methods
		Customer obj = null;
		Iterator<Customer> i=customers.iterator();
        while(i.hasNext()){
      	  
      	  Customer test=i.next();
	      	if(test.getCustomerID()==id)
			{
				obj = test;
				break;
			}
        }
        if(obj==null)
		{
			System.out.println("Object not found!!");
			System.exit(0);
		}
		System.out.println("Enter Customer Name: ");
		String name= sc.next();
		obj.setCustomerName(name);
		System.out.println("Enter Customer Address: ");
		String address= sc.next();
		obj.setCustomerAddress(address);
		System.out.println("Customer with id "+id+" updated.");
		System.out.println("\n");
	}
	
	public void listCustomer() {
		Iterator<Customer> i=customers.iterator();
        while(i.hasNext()){
      	  
      	  	Customer test=i.next();
      	  	System.out.println("details of customer--> "+test.getCustomerName()+"-"+test.getCustomerID()+"-"+test.getCustomerAddress());
        }
		System.out.println("\n");
	}
	
	public boolean deleteCustomer(int id) {
		Customer obj = null;
		Iterator<Customer> i=customers.iterator();
        while(i.hasNext()){
      	  
      	  Customer test=i.next();
	      	if(test.getCustomerID()==id)
			{
				obj = test;
				break;
			}
        }
        if(obj==null)
		{
			System.out.println("Object not found!!");
			System.exit(0);
		}
		customers.remove(obj);
		System.out.println("Customer is deleted by id " + id);
		System.out.println("\n");
		return true;
	}
}
