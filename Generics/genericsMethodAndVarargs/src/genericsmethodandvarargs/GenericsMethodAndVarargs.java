/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsmethodandvarargs;

import java.util.*;

/**
 *
 * @author vital22 September
 * Дженерики для строк и для целыхчисел один метод на двоих
 */
public class GenericsMethodAndVarargs {


    public static void main(String[] args) {
        //инициализации Arrays
        Integer[] intersI = {52,5,3,20,50}; 
        String[] intersS = {"Строка","Которая","Смогла"};
        
        //Переопрделим массивы в листы
        List newAnonList = Lists.toList(new Integer[]{1,46,8});
        List newListI = Lists.toList(intersI);
        List newList = Lists.toList(intersS);
        
        //вывести все значения листов
        newList.forEach(e -> System.out.println(e));
        newListI.forEach(e -> System.out.println(e));
        
        //Находим минимальное значение 
        System.out.println("Минимальное значение массива intersI " + 
                ArrayMin.min(intersI));
        
    }
    
}
/*
 * 
 * @param arr - входящий массив, который преобразуется в Коллекцию(List)
 * список
 * @return list - вернёт список 
 */
class Lists{
    public static <T> List<T> toList(T[] arr){
        List <T> list = new ArrayList<T>();
        for(T a : arr)
        {
            list.add(a);
        }
        return list;
    }
}
/**
 * 
 * @param arr - массив значений
 * Ограничим Дженерик <T extends Comparable> теперь любой класс, к который будет
 * применён наш Дженерик метод, должен будет реализовать интерфейс
 * Comparable (сравниваемый)
 * @method compartTo - сравнивает два значения,
 */

class ArrayMin{
    public static <T extends Comparable> T min(T[] arr){
        T min = arr[0];
        for (int i = 1; i< arr.length;i++)
            if(min.compareTo(i) > 0) min = arr[i];
        return min;
    }
}