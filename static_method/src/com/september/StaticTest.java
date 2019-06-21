package com.september;

public class StaticTest {
    public static final String pazaInterAmala = "AMALA - PAZZA INTER AMALA";
    private  static int exNums = 1; //это статическое поле имеется у каждого класса, это Номер объекта
    private int myNum = 0;
    public StaticTest(){
        myNum = exNums ++;// при создании объекта увеличивает порядковый номер
    }

    public static void fullName(String name, String sname){
        System.out.println("Сейчас тут напишут имя неудачника");
        System.out.println(name + " " + sname + "ты конкретный лох");
    }
    public void getId(){
        System.out.println(myNum);
    }
}

