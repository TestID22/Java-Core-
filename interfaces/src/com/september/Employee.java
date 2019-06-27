package com.september;

public class Employee implements ICompate , Comparable{
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object otherObject) {
        Employee other = (Employee) otherObject; //преобразовываем тип который передаётся в Параметре
        if (salary > other.salary) return 1;
        if (salary < other.salary) return -1;
        return 0;
    }
}
