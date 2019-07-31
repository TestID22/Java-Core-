/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thousandcontaindthree;

/**
 *
 * @author vital22
 * Решаю задачу, на вхождения тройки в 1000.
 */
public class ThousandContaindThree {

   
    public static void main(String[] args) {
        int [] thousand = new int[1000];
       for (int i = 0; i < 1000;i++)
           thousand[i] = i;
       int count = 0;
       for (int i = 0; i < thousand.length; i++)
       {
           String n = Integer.toString(thousand[i]);
           if(n.contains("3"))
               count++;
       }
           System.out.println(count);
                  
    }
    
}
