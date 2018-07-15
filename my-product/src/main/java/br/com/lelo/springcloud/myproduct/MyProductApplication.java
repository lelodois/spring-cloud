package br.com.lelo.springcloud.myproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MyProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProductApplication.class, args);
    }

}
