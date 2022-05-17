package com.codegym.model;

public class Product {
    int id;
    String name;
    int price;
    int inStock;

    public Product() {
    }

    public Product(int id, String name, int price, int inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}

