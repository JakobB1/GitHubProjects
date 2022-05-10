package com.company;

public class Product {
    private int sku;
    private String name;
    private double price;

    public Product(int sku, String name, double price){
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return getSku() + " " + getName() + " " + getPrice();
    }

}
