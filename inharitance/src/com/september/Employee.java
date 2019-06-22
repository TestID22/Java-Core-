package com.september;

public class Employee {
    private String name;
    private double salary;

    public Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public  void giveRaise(double percent){
        double pay = salary * percent / 100;
        salary = salary + pay;
    }
}
