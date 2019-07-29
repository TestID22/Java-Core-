
package testenum;

import java.util.ArrayList;


public class TestEnum {

   
    public static void main(String[] args) {
        Fsociety fs[] = Fsociety.values();
        
        for (Fsociety f: fs)
        {
            System.out.println("Хакер :" + f + "\nЗарплата " + f.getSalary());
        }
        
    }
}

enum Fsociety{
    Elliot(45000), Darling(0), Tyrell(125000);
    double salary;
    private Fsociety(double salary) {
        this.salary = salary;
    }
    
    double getSalary(){
    return salary;
    }
}