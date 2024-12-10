package com.nikijv.hometask2.task4;

public class Device {
    public String name;
    public String description;
    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void sound(){
        System.out.println("Sound of " + name);
    }
    public void show(){
        System.out.println(name);
    }
    public void desc(){
        System.out.println(description);
    }
}
