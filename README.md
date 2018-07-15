https://medium.com/@locosta_61043/spring-cloud-netflix-organizando-seus-microservi%C3%A7os-5b89c443640c

# Spring-cloud (my-config-server)

Exemplo de configuração usando o spring cloud
![SpringClound](https://github.com/lelodois/spring-cloud/blob/master/images/novas/microservices-springcloud.png)

### Eureka server

Projeto que registra os microserviços e monitora o status de cada
![Eureka](https://github.com/lelodois/spring-cloud/blob/master/images/novas/eureka.png)

![EurekaDiagrama](https://github.com/lelodois/spring-cloud/blob/master/images/novas/eureka-diagrama.png)

### Config server

![ConfigServer](https://github.com/lelodois/spring-cloud/blob/master/images/novas/configserver-diagrama.png)
* Lê as configurações do github dos projetos abaixo:

#### Configurações
  - http://localhost:9080/my-eureka/default
  - http://localhost:9080/my-customer/default
  - http://localhost:9080/my-product/default
  - http://localhost:9080/my-sale/default
  - http://localhost:9080/my-zuul/default

#### MyZuul
  Projeto de proxy para os serviços rest
  ![Zuul](https://github.com/lelodois/spring-cloud/blob/master/images/novas/comxsem-zuul.png)


### Microservices projects

Projetos de microserviços que retorna um json via Rest

- https://github.com/lelodois/spring-cloud/tree/master/my-customer
- https://github.com/lelodois/spring-cloud/tree/master/my-product
- https://github.com/lelodois/spring-cloud/tree/master/my-sale
