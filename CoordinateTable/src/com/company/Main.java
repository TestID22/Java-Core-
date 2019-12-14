package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoordConsole table = new CoordConsole();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X координату");
        int coordX = in.nextInt();
        System.out.println("Введите Y координату");
        int coordY = in.nextInt();

        table.showTable(coordX,coordY);
    }
}
