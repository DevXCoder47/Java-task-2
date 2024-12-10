package com.nikijv.hometask2.task1;
public class Pilot extends Human{
    public String profession;
    public Pilot(String fullName, int age) {
        super(fullName, age);
        profession = "Pilot";
    }
    public void speak(){
        System.out.println(profession + " speaking: " + fullName + ", age - " + age);
    }
}
