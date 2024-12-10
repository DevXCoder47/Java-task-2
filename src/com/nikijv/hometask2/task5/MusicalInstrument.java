package com.nikijv.hometask2.task5;

public class MusicalInstrument {
    public String name;
    public String description;
    public String history;
    public MusicalInstrument(String name, String description, String history) {
        this.name = name;
        this.description = description;
        this.history = history;
    }
    public void show(){
        System.out.println(name);
    }
    public void desc(){
        System.out.println(description);
    }
    public void history(){
        System.out.println(history);
    }
    public void sound(){
        System.out.println("Sound of " + name);
    }
}
