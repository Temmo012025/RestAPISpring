package com.example.demo.repositories;

import com.example.demo.Domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//jpa repo gives a number of options such as findall, getone etc.
//the interface will provide the implementation at run time.
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
