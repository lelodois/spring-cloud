package br.com.lelo.springcloud.myconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyConfigApplication.class, args);
    }
}
