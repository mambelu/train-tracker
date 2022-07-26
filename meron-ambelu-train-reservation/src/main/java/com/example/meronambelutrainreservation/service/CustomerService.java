package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Customer;
import com.example.meronambelutrainreservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository ;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Integer customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.isPresent() ? customer.get() : null;
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
    public void deleteCustomer(Integer customerId) {  customerRepository.deleteById(customerId);  }
//when we update a customer we will pass the request body with the id of the customer we want to update.

    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

}
