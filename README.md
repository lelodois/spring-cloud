# Spring-cloud (my-config-server)

Exemplo de configuração usando o spring cloud

### Eureka server

Projeto que registra os microserviços e monitora o status de cada

![Eureka](https://github.com/lelodois/spring-cloud/blob/master/eureka.png)

### Config server

* Lê as configurações do github dos projetos abaixo:

  - (my-eureka) https://github.com/lelodois/spring-cloud/blob/master/my-eureka.yml
  - (my-microservice.yml) https://github.com/lelodois/spring-cloud/blob/master/my-eureka.yml
  
-  http://localhost:9090/my-eureka/default
![Eureka](https://github.com/lelodois/spring-cloud/blob/master/my-eureka.png)

-  http://localhost:9090/my-microservice/default
![Microservice](https://github.com/lelodois/spring-cloud/blob/master/my-microservice.png)


### Microservice project

Projeto de microserviços que se registra no github

