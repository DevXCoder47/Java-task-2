package com.nikijv.hometask2.task2;

public class Animal {
    protected String name;
    protected String sex;
    protected int age;
    public Animal(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
