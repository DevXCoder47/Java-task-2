package com.nikijv.hometask2.task1;

public class Builder extends Human{
    public String profession;
    public Builder(String fullName, int age) {
        super(fullName, age);
        profession = "Builder";
    }
    public void speak(){
        System.out.println(profession + " speaking: " + fullName + ", age - " + age);
    }
}
