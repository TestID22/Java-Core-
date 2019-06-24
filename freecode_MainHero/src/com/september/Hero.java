package com.september;



public class Hero {
    private int hp = 100;
    private int atack = 10;
    public Hero(int hp, int atack){
        this.hp = hp;
        this.atack = atack;
    }
    public void attackEnemy(Enemy x){
        x.getPunch();
    }
}
