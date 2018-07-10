package br.com.lelo.springcloud.mysale.controller;

import br.com.lelo.springcloud.mysale.model.Sale;
import br.com.lelo.springcloud.mysale.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private SaleService service;

    @GetMapping("all")
    public ResponseEntity<List<Sale>> message() {
        return ResponseEntity.ok(service.getList());
    }
}
