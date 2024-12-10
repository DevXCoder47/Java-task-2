package com.nikijv.hometask2.task3;
public class Money{
    public int hryvnias;
    public int kopecks;
    public Money(int hryvnias, int kopecks){
        this.hryvnias = hryvnias;
        if(kopecks > 99){
            this.hryvnias += kopecks / 100;
            this.kopecks = kopecks % 100;
        }
        else
            this.kopecks = kopecks;
    }
    public void costInfo(){
        System.out.print("Hryvnias: " + hryvnias + " ");
        System.out.print("Kopecks: " + kopecks + " ");
        System.out.println();
    }
    public void lowerPrice(int kopecks){
        if(kopecks > 99){
            while(kopecks > 99){
                kopecks -= 100;
                this.hryvnias--;
            }
        }
        if(kopecks > this.kopecks){
            this.kopecks = 100 - (kopecks - this.kopecks);
            this.hryvnias--;
        }
        else
            this.kopecks -= kopecks;
    }
}
