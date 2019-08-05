/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp.javastructandalgorithm;

public class ArrayClass {
    private int[] myArray;
  
    public ArrayClass(int size) {
        myArray = new int[size];
    }
    //добавить элемент
    public void setElement(int index, int num){
        myArray[index] = num;
    }
    //чтение
    public int getElement(int index){
        return myArray[index];
    }
    //вывести массив в консоль
    public void display(){
        for(int i = 0; i < myArray.length; i++)
            System.out.println("Индекс [" + i + "]" + " значение - " 
                    + myArray[i]);
    }
    public void findElemet(int searchNum){
        int i;
        for(i = 0; i < myArray.length; i++)
            if(myArray[i] == searchNum)
                break;
            
        if(i == myArray.length)
            System.out.println("Искомый файл не найден " + searchNum);
        else
            System.out.println("Файл найден " + searchNum);
    }
    
}
