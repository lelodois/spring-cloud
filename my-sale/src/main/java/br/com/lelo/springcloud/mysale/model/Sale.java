package br.com.lelo.springcloud.mysale.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import org.apache.commons.lang.math.RandomUtils;

import java.util.Date;
import java.util.List;

public class Sale {

    private Long clientCode;

    private Date date;

    private List<Item> itemList = Lists.newArrayList();

    public Sale(Long saleCode) {
        this.clientCode = saleCode;
        this.date = new Date();
    }

    public Long getClientCode() {
        return clientCode;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public Sale addItem(int quantity, long productCode) {
        this.itemList.add(new Item(quantity, productCode));
        return this;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void setClientCode(Long clientCode) {
        this.clientCode = clientCode;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy HH:mm:ss")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
