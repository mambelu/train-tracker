package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.Customer;
import com.example.meronambelutrainreservation.model.Station;
import com.example.meronambelutrainreservation.service.CustomerService;
import com.example.meronambelutrainreservation.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public Customer addStation (@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer")
    public List<Customer> getAllStations () {

        return customerService.findAllCustomers();
    }

    @GetMapping ("/customer/{customerId}")
    public Customer getStationById (@PathVariable Integer customerId){
        return customerService.getCustomerById(customerId);
    }

    @PutMapping("/customer")
    public void updateStation(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping ("/customer/{customerId}")
    public void deleteStation(@PathVariable Integer customerId) {
        customerService.deleteCustomer(customerId);
    }
}
