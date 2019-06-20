package com.september.sportcar;

public class Sportcar {
    private int speed = 10;
    private  String name;
    Sportcar (int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
}
