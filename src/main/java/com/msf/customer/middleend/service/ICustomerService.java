package com.msf.customer.middleend.service;

import com.msf.customer.middleend.domain.Customer;

public interface ICustomerService {

    Customer createCustomer(String xCmClientRequestId, String xCmClientUserAgent, Customer customer);
}
