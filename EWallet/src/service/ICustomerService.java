package service;

import java.util.Set;

import entities.Customer;

public interface ICustomerService {

	void addCustomer(Customer c);
	
	Customer findCustomerByMobileNo(String mobileNo);
	
	Set<Customer> allCustomers();
	
}
