/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp.javastructandalgorithm;

public class NewArrayClass {
    private int [] myArray;
    private int nElements; //счётчик - роль индекса
    
    public NewArrayClass(int size) {
        myArray = new int[size];
        nElements = 0;
    }
    public void add(int element){
        myArray[nElements] = element;
        nElements++;
    }
    
    
    public boolean find(int searchNum){
        int j;
        for (j =0; j < myArray.length; j++)
            if (myArray[j] == searchNum)
                break;
        if(j == myArray.length)
            return false;
        else
            return true;   
    }
                
    //Реализация удаления, со свдигом как АrrayList
    
    public boolean delete(int element){
        int i;
        for (i = 0; i < myArray.length; i++)
            if(myArray[i] == element)
                break;
        
        if (i == nElements)
            return false;
        else
        {
            for(int k = i; k < nElements; k++) // Сдвиг последующих элементов
            myArray[k] = myArray[k+1];
            nElements--; // Уменьшение размера
            return true;
        }
    }
    public void display(){
        for(int i = 0; i < myArray.length; i++)
            System.out.println("Индекс [" + i + "]" + " значение = " 
                    +  myArray[i]);
    }    
  
        
        
    
    
}
