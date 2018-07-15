package br.com.lelo.springcloud.mycustomer.controller;

import br.com.lelo.springcloud.mycustomer.model.Customer;
import br.com.lelo.springcloud.mycustomer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v8/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("active/all")
    public ResponseEntity<List<Customer>> message() {
        return ResponseEntity.ok(service.getAll());
    }
}
