/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iotest;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author vitalii22
 * IO работа с каталогами, и файлами. 
 * FileInputStream - класс, позволяет работать только с байтами
 */
public class IOtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //определить рабочий каталог пользователя
        System.out.println("Рабочий каталог(где мы находимся)");
        System.out.println(System.getProperty("user.dir")); 
        
        System.out.println("-------------------------------------------------");
        //проложим путь к файлам, File класс работает с папками, файлами, и директориями
        File f = new File("c://users//vital//desktop//");
        String [] dir = f.list();//в массиве строк поместим список файлов
        for (String s: dir)
            System.out.println(s);
        
        System.out.println("-------------------------------------------------");
        FileInputStream text = new FileInputStream(f + "/22.txt");
        int lenghth = text.available();//количество байт доступных для чтения
        
        System.out.println("File size : " + lenghth);
        
        byte[] data = new byte[lenghth];
        
        //считываем количество байтов из потока объекта FileInputStream
        text.read(data);
        //второй параметр принимает кодировку файла
        String sData = new String(data, "cp1251"); 
        //конвертация для подсчёта символов в массив char
        char[] cData = sData.toCharArray();
        
        int countN = 0;
        for(char c: cData)
            if(c == 'a')
            {   
                countN++;
            }
        System.out.println(countN);
       
       
        
    }
}
