# Spring-cloud (my-config-server)

Exemplo de configuração usando o spring cloud

### Config server

* Lê as configurações do github dos projetos abaixo:

  - (my-eureka) [https://github.com/lelodois/spring-cloud/blob/master/my-eureka.yml]
  - (my-microservice.yml) [https://github.com/lelodois/spring-cloud/blob/master/my-eureka.yml]
  
-  http://localhost:9090/my-microservice/default
-  http://localhost:9090/my-eureka/default

### Eureka server

Projeto que registra os microserviços e monitora o status de cada


### Microservice project

Projeto de microserviços que se registra no github

