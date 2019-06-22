package com.september;

public class Manger extends Employee{
    private double bonus;
    public Manger (String name, double salary){
        super(name, salary);
        bonus = 0;

    }
    //@overriding
    public double getSalary(){ // переопределили метод
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
