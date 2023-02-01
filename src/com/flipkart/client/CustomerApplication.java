/**
 * 
 */
package com.flipkart.client;

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
//		CustomerService service = new CustomerService();
//		
//		service.createCustomer();
//		service.deleteCustomer(101);
//		service.deleteCustomer(101);
//		service.listCustomer();
//		
//		DemoTest obj = new DemoTest();
//		obj.test();
		
		//In Method Overriding object of base class is declared
//		CustomerServiceOperations obj = new PaymentService();
//		obj.testOverride();
		
		CustomerService obj = new CustomerServiceOperations();
		obj.createCustomer();
		obj.listCustomer();
		obj.deleteCustomer(101);
		obj.updateCustomer(102);
		obj.listCustomer();
	}

}
