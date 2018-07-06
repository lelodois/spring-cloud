package br.com.lelo.springcloud.myeurekaclient.controller;

import br.com.lelo.springcloud.myeurekaclient.model.Message;
import br.com.lelo.springcloud.myeurekaclient.model.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservice")
public class StatusController {

    @Autowired
    private MessageService service;

    @GetMapping("status")
    public ResponseEntity<Message> message() {
        return ResponseEntity.ok(service.getStartupMessage());
    }
}
