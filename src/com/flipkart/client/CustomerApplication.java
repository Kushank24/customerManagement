/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.demo.AbstractDemo;
import com.flipkart.demo.DemoTest;
import com.flipkart.service.CustomerService;
import com.flipkart.service.CustomerServiceOperations;
import com.flipkart.service.PaymentService;

/**
 * @author kushank.maheshwari
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the instance (object) of service class
		Scanner sc= new Scanner(System.in);
		CustomerService obj = new CustomerServiceOperations();
		int choice;
		do {
			System.out.println("Welcome to Customer Management System");
			System.out.println("1. Create Customer");
			System.out.println("2. Update Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Show List of customer");
			System.out.println("5. Exit");
			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
			int id;
			switch(choice)
			{
				case 1:
					obj.createCustomer();
					break;
				case 2:
					System.out.println("Enter the id of the customer you want to update: ");
					id = sc.nextInt();
					obj.updateCustomer(id);
					break;
				case 3:
					System.out.println("Enter the id of the customer you want to update: ");
					id = sc.nextInt();
					obj.deleteCustomer(id);
					break;
				case 4:
					obj.listCustomer();
					break;
				case 5:
				default:
					break;
					
			}
		}while(choice!=5);
	}

}
