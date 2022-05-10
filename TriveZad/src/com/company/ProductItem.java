package com.company;

public class ProductItem {

    private Product product;
    private double quantity;

    public ProductItem() {
    }

    public ProductItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getItem() {
        return product;
    }

    public void setItem(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return product.toString() + " " + getQuantity();
    }
}
