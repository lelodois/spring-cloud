package br.com.lelo.springcloud.mysale.model;

public class Item {

    private int quantity;

    private Long productCode;

    public Item(int quantity, Long productCode) {
        this.quantity = quantity;
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }
}
