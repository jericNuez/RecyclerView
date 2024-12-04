package com.example.recyclerview;

public class Fruit {
    private String name;
    private Double price;

    public Fruit(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
