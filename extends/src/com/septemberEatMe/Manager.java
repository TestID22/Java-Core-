package com.septemberEatMe;
import java.util.Scanner;

public class Manager extends Person{
    Scanner in = new Scanner(System.in);
    public Manager(String name, int salary) {
        super(name, salary); //Вызов конструктора суперкласса Call a superclass constructor
    }
    public String makeHacker(){
        String newHacker = super.makeHacker(in.nextLine());
        return newHacker + " но только - Мамкин";

    }
}
