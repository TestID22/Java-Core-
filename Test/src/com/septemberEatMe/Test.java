package com.septemberEatMe;

public class Test {

        double weight;
        double height;
        double area;
        public Test (double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
        public double getArea(){
            area = weight * height;
            return area;
        }

    }

