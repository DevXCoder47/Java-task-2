package com.nikijv.hometask2;
import com.nikijv.hometask2.task1.*;
import com.nikijv.hometask2.task2.*;
import com.nikijv.hometask2.task3.*;
import com.nikijv.hometask2.task4.*;
import com.nikijv.hometask2.task5.*;
import com.nikijv.hometask2.task6.*;
import com.nikijv.hometask2.task7.*;
public class Main {
    public static void main(String[] args) {

        task7();
    }
    //<editor-fold desc="Task 1"
    public static void task1(){
        Human human = new Human("Human1", 10);
        Human builder = new Builder("Human2", 20);
        Human sailor = new Sailor("Human3", 30);
        Human pilot = new Pilot("Human4", 40);
        human.speak();
        builder.speak();
        sailor.speak();
        pilot.speak();
    }
    //</editor-fold>
    //<editor-fold desc="Task 2"
    public static void task2(){
        Animal animal = new Animal("Animal", "M", 1);
        Animal tiger = new Tiger( "M", 2);
        Animal crocodile = new Crocodile("F", 3);
        Animal kangaroo = new Kangaroo("F", 4);
        animal.info();
        tiger.info();
        crocodile.info();
        kangaroo.info();
    }
    //</editor-fold>
    //<editor-fold desc="Task 3"
    public static void task3(){
        Product product = new Product("Product1", new Money(4,45));
        product.lowerPrice(88);
        product.show();
    }
    //</editor-fold>
    //<editor-fold desc="Task 4"
    public static void task4(){
        Device[] devices = {new Kettle("Kettle", "Kettle desc"),
                new Microwave("Microwave", "Microwave desc"),
                new Automobile("Automobile", "Automobile desc"),
                new Steamboat("Steamboat", "Steamboat desc")
        };
        for (Device device : devices) {
            device.show();
            device.desc();
            device.sound();
            System.out.println();
        }
    }
    //</editor-fold>
    //<editor-fold desc="Task 5"
    public static void task5(){
        MusicalInstrument[] instruments = {
                new Violin("Violin", "Violin desc", "Violin hist"),
                new Trombone("Trombone", "Trombone desc", "Trombone hist"),
                new Ukulele("Ukulele", "Ukulele desc", "Ukulele hist"),
                new Cello("Cello", "Cello desc", "Cello hist")
        };
        for (MusicalInstrument instrument : instruments) {
            instrument.show();
            instrument.desc();
            instrument.history();
            instrument.sound();
            System.out.println();
        }
    }
    //</editor-fold>
    //<editor-fold desc="Task 6"
    public static void task6(){
        Array array = new Array(10);
        array.show();
        System.out.println("Max " + array.max());
        System.out.println("Min " + array.min());
        System.out.println("Avg " + array.avg());
    }
    //</editor-fold>
    //<editor-fold desc="Task 7"
    public static void task7(){
        Array2 array = new Array2(10);
        array.show();
        array.sortDesc();
        array.show();
        array.sortAsc();
        array.show();
    }
    //</editor-fold>
}
