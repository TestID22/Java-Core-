package com.septemberEatMe;

public class Stack {
    int stck[] = new int[10];
    int tos;


    public Stack() {
        tos = -1;
    }
    public void push(int i){
        if (tos==9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = i;
    }
     public int pop () {
            if (tos < 0) {
                System.out.println("Стек пуст");
                return 0;
            }
            else
                return  stck[tos--];

        }

}