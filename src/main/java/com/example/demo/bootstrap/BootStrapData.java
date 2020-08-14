package com.example.demo.bootstrap;

import com.example.demo.Domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading customers");
        Customer c1 = new Customer();
        c1.setFirstName("mohamed");
        c1.setLastName("attia");
        customerRepository.save(c1);
        Customer c2 = new Customer();
        c2.setFirstName("mohamed2");
        c2.setLastName("attia2");
        customerRepository.save(c2);
        System.out.println("customers saved "+customerRepository.count());
    }
}
