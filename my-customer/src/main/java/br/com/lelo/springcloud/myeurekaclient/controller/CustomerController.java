package br.com.lelo.springcloud.myeurekaclient.controller;

import br.com.lelo.springcloud.myeurekaclient.model.Customer;
import br.com.lelo.springcloud.myeurekaclient.model.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("all")
    public ResponseEntity<List<Customer>> message() {
        return ResponseEntity.ok(service.getAll());
    }
}
