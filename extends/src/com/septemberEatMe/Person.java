package com.septemberEatMe;
import java.util.Scanner;



public class Person {
    private String name;
    private int salary;
    public Person(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String makeHacker(String name){
        return name + " Хакер";
    }

}
