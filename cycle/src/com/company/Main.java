package com.company;

public class Main {

    public static void main(String[] args) {
	    int x, y;
	    x = 0;
	    y = 20;
	    int num = 100;
			for (x = 0; x < 10; x++) { // фигурные скобки обозначают блочную систему
			//переменная x инициализирует цикл, x++ инкремент
			System.out.println("Текущее значение x: " + x);
			System.out.println("Текущее значение y" + y);
			System.out.println(num);
			num = num - 1;
			y = y - 2;
		}
    }
}
