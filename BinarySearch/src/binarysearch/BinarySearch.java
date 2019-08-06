/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author vital
 * Важно: Для бинарного Поиска есть, условие, упорядоченный Массив, числа должны
 * быть отсортированы в порядке увеличения
 * 
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums = {1, 5, 9, 12, 67, 88, 99, 112, 222};
        System.out.println("Порядковый номер "  +
                BinaryClass.findBinary(nums, 1));
       
    }
    
}
