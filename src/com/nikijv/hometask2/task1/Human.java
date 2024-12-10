package com.nikijv.hometask2.task1;
public class Human {
    public String fullName;
    public int age;
    public Human(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void speak(){
        System.out.println("Human speaking: " + fullName + ", age - " + age);
    }
}
