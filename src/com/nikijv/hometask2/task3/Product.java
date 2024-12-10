package com.nikijv.hometask2.task3;

public class Product {
    public String name;
    public Money price;
    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }
    public void lowerPrice(int amount) {
        price.lowerPrice(amount);
    }
    public void show(){
        System.out.println("Name: " + name);
        System.out.print("Price: ");
        price.costInfo();
    }
}
