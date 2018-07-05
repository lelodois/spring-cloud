package br.com.lelo.springcloud.myeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClientApplication.class, args);
    }
}
