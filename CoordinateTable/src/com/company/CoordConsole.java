package com.company;

import java.util.Scanner;

public class CoordConsole {
    private int [][] coordinate = new int[9][9];
    Scanner in = new Scanner(System.in);


    public void createTavlbe(){
        for(int y = 0; y < 9;y++){
            for(int x = 0; x < 9; x++){
                coordinate[x][y] = x * y;
            }
        }
    }

    public void showTable(int coordX, int coordY){
        System.out.println("Координатная таблица");
        for(int y = 0; y < 9; y++){
            for(int x = 0; x < 9; x++){
                if(x == coordX && y == coordY) {
                    System.out.print("X");
                }else {
                    System.out.print("O");
                }
                continue;
            }
            System.out.println("O");
        }
    }

}
