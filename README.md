# Spring-cloud (my-config-server)

Exemplo de configuração usando o spring cloud

### Eureka server

Projeto que registra os microserviços e monitora o status de cada

![Eureka](https://github.com/lelodois/spring-cloud/blob/master/images/eureka.png)

### Config server

* Lê as configurações do github dos projetos abaixo:

#### MyEureka
  -  http://localhost:9090/my-eureka/default
  ![Eureka](https://github.com/lelodois/spring-cloud/blob/master/images/my-eureka.png)

#### MyMicroservice
  -  http://localhost:9090/my-microservice/default
![Microservice](https://github.com/lelodois/spring-cloud/blob/master/images/my-microservice.png)

#### MyZuul
  Projeto de proxy para os serviços rest
  - http://localhost:9090/my-zuul/default

### Microservice project

Projeto de microserviços que retorna um json com a quantidade de requests já realizados

