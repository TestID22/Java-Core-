/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp.javastructandalgorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vitalii 22 september
 * Создаём Велосипед Массива
 * 
 */
public class ArrayAppJavaStructAndAlgorithm {

    public static void main(String[] args) {
        //работа первым классом AC
        ArrayClass myOwnArray = new ArrayClass(10);
        //добавляем элементы
        myOwnArray.setElement(0, 1);
        myOwnArray.setElement(9, 2);
        myOwnArray.setElement(1, 13);
        
        System.out.println("Работа класса ArrayClass");
        System.out.println("--------------------------------------------------");
        myOwnArray.display();
        
        System.out.println();
        //проверяем метод поиска по значению
        myOwnArray.findElemet(13); 
        
        //проверем метод поиска по индексу
        System.out.println("Значение элемента по индексу 9 = " + 
                myOwnArray.getElement(9));
        System.out.println();
        
        System.out.println("--------------------------------------------------");
        
        //работа со вторым классом
        NewArrayClass myNewArrayClass = new NewArrayClass(10);
        //Добавление элементов 
        myNewArrayClass.add(1);       
        myNewArrayClass.add(3);
        myNewArrayClass.add(5);
        myNewArrayClass.add(7);
        myNewArrayClass.add(1);
        
        
        System.out.println("Работа класса NewArrayClass До Удаления");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Знаение найдено статус:" + myNewArrayClass.find(1));
        
        System.out.println();
        myNewArrayClass.display();
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("После удаления");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        myNewArrayClass.delete(3);
        myNewArrayClass.display();
        
                
    }
}


