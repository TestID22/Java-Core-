package com.september;

public class Enemy {
    private int hp = 100;
    public Enemy (int hp){
        this.hp = hp;

    }
    public void getPunch(){
        hp = hp - 10;
    }

    public int getHp() {
        return hp;
    }
}
