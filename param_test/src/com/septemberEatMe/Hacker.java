package com.septemberEatMe; //пакет с классом, его импортим в мейн класс

public class Hacker {
    private String name;
    private double salary;
    public Hacker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return  name;
    }
    public double getSalary(){
        return  salary;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}