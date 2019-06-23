package com.september;

public class Enemy extends Hero{
    public Enemy(String name){
        super(name);
    }
    @Override
    public String getDescription() {
        return String.format("тут только враги АнтиГерой");
    }
}
