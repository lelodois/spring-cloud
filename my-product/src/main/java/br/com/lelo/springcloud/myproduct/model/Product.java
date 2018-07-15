package br.com.lelo.springcloud.myproduct.model;

public class Product {

    private Long clientCode;

    private String name;

    public Product(Long clientCode, String name) {
        this.clientCode = clientCode;
        this.name = name;
    }

    public Long getClientCode() {
        return clientCode;
    }

    public void setClientCode(Long clientCode) {
        this.clientCode = clientCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
