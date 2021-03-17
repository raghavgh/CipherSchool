package com.company;

public class Product {
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Product(Double price, Double quantity, String productName) {
        this.price = price;
        this.quantity = quantity;
        this.productName = productName;
    }

    private Double price;
    private Double quantity;
    private String productName;
}
