package com.nikijv.hometask2.task1;

public class Sailor extends Human{
    public String profession;
    public Sailor(String fullName, int age) {
        super(fullName, age);
        profession = "Sailor";
    }
    public void speak(){
        System.out.println(profession + " speaking: " + fullName + ", age - " + age);
    }
}
