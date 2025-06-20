package com.jvmcosta.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        addProductStock(quantity);
    }

    public int getQuantityInStock(){
        return quantity;
    }

    public void addProductStock(int quantity){
        this.quantity+=quantity;
    }

    public void removeProductStock(int quantity){
        this.quantity-=quantity;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

}
