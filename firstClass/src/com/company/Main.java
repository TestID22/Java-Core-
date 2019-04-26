package com.company;
import java.util.*;
class Tank{
    int level;
}

public class Main {
    public  static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 19;
        t2.level = 48;
        System.out.println("1: t1.level :" + t1.level);

    }
}