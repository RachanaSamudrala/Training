package dao;

import java.util.Set;

import entities.Customer;

public interface ICustomerDao {

	void addCustomer (Customer c);
	
	Customer findCustomerByMobileNo (String mobileNo);
	
	Set<Customer> allCustomers();
	
}
