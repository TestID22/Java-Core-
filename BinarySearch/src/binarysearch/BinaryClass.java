/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;

/**
 *
 * @author vital
 * @param a - ОТСОРТИРОВАННЫЙ МАССИВ
 * @param searchNum - найти число
 * @return  вернёт порядковый номер для searcgNum в массиве
 */
public class BinaryClass {
     
    public static int findBinary(int []a, int searchNum){
        int first = 0;
        int last = a.length;
        int curIn; //переменная Индекс 
        while(true)
        {
            curIn = (first + last) / 2;
            if(a[curIn] == searchNum)
                return curIn;
            else if (first > last)
                return 0;
            else
            {
                if(a[curIn] < searchNum)
                    first = curIn + 1;
                else
                    last = curIn - 1;
            }
        }
    }
}
