package br.com.lelo.springcloud.mysale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MySaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySaleApplication.class, args);
    }

}
